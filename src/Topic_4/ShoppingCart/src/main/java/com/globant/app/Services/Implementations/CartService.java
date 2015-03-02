package com.globant.app.Services.Implementations;

import com.globant.app.DataAccess.Repositories.IUsersRepo;
import com.globant.app.Domain.Discounts.IDiscountManager;
import com.globant.app.Domain.Entities.Cart;
import com.globant.app.Domain.Entities.Transaction;
import com.globant.app.Domain.Entities.User;
import com.globant.app.Domain.Events.IEventLogger;
import com.globant.app.Domain.PaymentMethods.IPaymentMethod;
import com.globant.app.Domain.Utilities.IUserManager;
import com.globant.app.Services.ICartService;

public class CartService implements ICartService {

	private IUsersRepo usersRepo;
	private IUserManager userManager;
	private IDiscountManager discountManager;
	private IEventLogger eventLogger;

	public CartService(IUsersRepo usersRepo, IUserManager userManager, IDiscountManager discountManager, IEventLogger eventLogger) {
		this.usersRepo = usersRepo;
		this.userManager = userManager;
		this.discountManager = discountManager;
		this.eventLogger = eventLogger;
	}

	@Override public Cart processCart(Cart cart, IPaymentMethod paymentMethod) {
		int userId = userManager.getCurrentUser().getId();

		User user = usersRepo.get(userId);

		Transaction transaction = Transaction.createTransaction(
				cart,
				user,
				paymentMethod,
				discountManager,
				eventLogger
		);

		return transaction.getDiscountedCart();
	}

	@Override public Cart checkout(Cart cart, IPaymentMethod paymentMethod) {
		int userId = userManager.getCurrentUser().getId();

		User user = usersRepo.get(userId);

		Transaction transaction = Transaction.createTransaction(
				cart,
				user,
				paymentMethod,
				discountManager,
				eventLogger
		);

		Cart discountedCart = transaction.execute();

		return discountedCart;
	}

	@Override public boolean saveCart(Cart cart) {
		int userId = userManager.getCurrentUser().getId();

		User user = usersRepo.get(userId);

		user.setStoredCart(cart);

		usersRepo.save(user);

		return true;
	}

	@Override public Cart getSavedCart() {
		int userId = userManager.getCurrentUser().getId();

		User user = usersRepo.get(userId);

		return user.getStoredCart();
	}
}
