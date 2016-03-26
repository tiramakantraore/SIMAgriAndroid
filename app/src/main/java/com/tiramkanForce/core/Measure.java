package com.tiramkanForce.core;



import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class Measure extends RealmObject {
    @PrimaryKey
    private String code;
    private String name;
    private Boolean isLocal;
    private Boolean isConvertible;
    private String description;
    private Double valeur;

    public Double getValeur() {
        return valeur;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
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

    public Boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Boolean getIsConvertible() {
        return isConvertible;
    }

    public void setIsConvertible(Boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
