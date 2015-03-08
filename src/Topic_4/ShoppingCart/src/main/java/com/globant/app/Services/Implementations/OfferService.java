package com.globant.app.Services.Implementations;

import com.globant.app.DataAccess.Repositories.IOffersRepo;
import com.globant.app.Domain.Entities.Offer;
import com.globant.app.Services.IOfferService;

import java.util.ArrayList;
import java.util.List;

public class OfferService implements IOfferService {

	private IOffersRepo offersRepo;

	public OfferService(IOffersRepo offersRepo) {
		this.offersRepo = offersRepo;
	}

	@Override public List<Offer> getOffers() {
		return new ArrayList<Offer>(offersRepo.all());
	}
}
