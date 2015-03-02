package com.globant.app.Services;

import com.globant.app.Domain.Entities.Cart;
import com.globant.app.Domain.PaymentMethods.IPaymentMethod;

public interface ICartService {

	public Cart processCart(Cart cart, IPaymentMethod paymentMethod);

	public Cart checkout(Cart cart, IPaymentMethod paymentMethod);

	public boolean saveCart(Cart cart);

	public Cart getSavedCart();
}
