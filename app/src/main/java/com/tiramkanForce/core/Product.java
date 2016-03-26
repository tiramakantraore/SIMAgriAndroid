package com.tiramkanForce.core;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class Product extends RealmObject {
    @PrimaryKey
    private String code;
    private String name;
    private String scientificName;
    private Boolean active;
    private ProductCategory category;
    private Measure measure;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
