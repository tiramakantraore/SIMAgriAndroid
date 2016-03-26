package com.tiramkanForce.core;


import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class Price extends RealmObject {
    private Market market;
    private Product product;
    private Measure measure;
    private Date date;
    private String status;
    private String priceCategory;
    private String comment;
    private String administratorComment;
    private Double amount;
    private User author;
    private User investigator;
    private Network network;
    private Boolean active;
    private Boolean rejected;
    private Boolean validated;

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

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getInvestigator() {
        return investigator;
    }

    public void setInvestigator(User investigator) {
        this.investigator = investigator;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }
}