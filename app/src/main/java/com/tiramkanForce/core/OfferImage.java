package com.tiramkanForce.core;

import io.realm.RealmObject;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class OfferImage extends RealmObject {
    private Measure measure;
    private Offer offer;

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
}
