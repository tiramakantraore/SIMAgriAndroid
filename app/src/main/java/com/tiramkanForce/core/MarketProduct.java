package com.tiramkanForce.core;

import io.realm.RealmObject;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class MarketProduct extends RealmObject {
    private Market market;
    private Product product;

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
