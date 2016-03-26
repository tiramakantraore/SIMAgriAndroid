package com.tiramkanForce.core;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class Quality extends RealmObject {
    @PrimaryKey
    private String code;
    private String name;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
