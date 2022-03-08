package com.microservices.daoInterface.call.shopping;

import java.util.List;

import com.microservices.entitiesModel.call.shopping.ShoppingOffers;

public interface CallShoppingGeneralDaoLayer {

	public List<ShoppingOffers> getOffers();
}
