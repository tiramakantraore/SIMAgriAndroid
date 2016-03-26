package com.tiramkanForce.core;

import io.realm.RealmObject;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class WarehouseProduct extends RealmObject {
    private Warehouse warehouse;
    private Product product;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
