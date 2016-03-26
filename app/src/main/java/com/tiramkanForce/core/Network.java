package com.tiramkanForce.core;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class Network extends RealmObject {
    @PrimaryKey
    private String name;
    private String webSite;
    private String comment;
    private String administratorComment;
    private String email;
    private Network parent;
    private Boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAdministratorComment() {
        return administratorComment;
    }

    public void setAdministratorComment(String administratorComment) {
        this.administratorComment = administratorComment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Network getParent() {
        return parent;
    }

    public void setParent(Network parent) {
        this.parent = parent;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
