package com.tiramkanForce.core;


import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class PriceHolder extends RealmObject {
    private String status;
    private Product product;
    private Market market;
    private Date date;
    private Double wholeSalePrice;
    private Double detailPrice;
    private Measure wholeSaleMeasure;
    private Measure detailMeasure;
    private String investigatorComment;
    private String administratorComment;
    private Boolean active;
    private User author;
    private Network network;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public void setWholeSalePrice(Double wholeSalePrice) {
        this.wholeSalePrice = wholeSalePrice;
    }

    public Double getDetailPrice() {
        return detailPrice;
    }

    public void setDetailPrice(Double detailPrice) {
        this.detailPrice = detailPrice;
    }

    public Measure getWholeSaleMeasure() {
        return wholeSaleMeasure;
    }

    public void setWholeSaleMeasure(Measure wholeSaleMeasure) {
        this.wholeSaleMeasure = wholeSaleMeasure;
    }

    public Measure getDetailMeasure() {
        return detailMeasure;
    }

    public void setDetailMeasure(Measure detailMeasure) {
        this.detailMeasure = detailMeasure;
    }

    public String getInvestigatorComment() {
        return investigatorComment;
    }

    public void setInvestigatorComment(String investigatorComment) {
        this.investigatorComment = investigatorComment;
    }

    public String getAdministratorComment() {
        return administratorComment;
    }

    public void setAdministratorComment(String administratorComment) {
        this.administratorComment = administratorComment;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}
