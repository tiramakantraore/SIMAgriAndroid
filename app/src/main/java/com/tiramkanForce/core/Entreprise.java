package com.tiramkanForce.core;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class Entreprise extends RealmObject {
    @PrimaryKey
    private String name;
    private String email;
    private String webSite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
