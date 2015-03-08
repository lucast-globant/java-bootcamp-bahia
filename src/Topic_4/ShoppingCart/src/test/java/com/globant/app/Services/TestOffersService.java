package com.globant.app.Services;

import com.globant.app.DataAccess.Repositories.IOffersRepo;
import com.globant.app.Services.Implementations.OfferService;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TestOffersService {

	private IOfferService offerService;
	private IOffersRepo offersRepo;

	@Before
	public void Setup() {
		offersRepo = mock(IOffersRepo.class);

		offerService = new OfferService(offersRepo);
	}

	@Test
	public void GetItems_Returns_Ok() {
		offerService.getOffers();

		verify(offersRepo).all();
	}
}

