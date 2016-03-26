package com.tiramkanForce.core;



import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class Place  extends RealmObject {
    @PrimaryKey
    private String name;
    private Double longitude;
    private Double latitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
