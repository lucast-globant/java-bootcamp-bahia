package com.globant.app.DataAccess.Repositories;

import com.globant.app.Domain.Entities.Offer;

import java.util.Collection;

public interface IOffersRepo extends IRepository<Offer> {

	public void add(Collection<Offer> offers);
}
