package com.tiramkanForce.core;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by tiramakan on 22/12/2015.
 */
public class Offer extends RealmObject {
    private String status;
    private String offerType;
    private String paymentMode;
    private Date date;
    private Integer delayInDays;
    private Date expirationDate;
    private Date validationDate;
    private Integer quantity;
    private Integer deliveryDelay;
    private Measure measure;
    private String conditions;
    private String description;
    private Product product;
    private Boolean validated;
    private Boolean rejected;
    private Boolean isForSell;
    private Double unitPrice;
    private Double totalPrice;
    private String operatorPhone;
    private String authorPhone;
    private Double longitude;
    private Double latitude;
    private Double wholesaleUnitPrice;
    private Double wholesaleTotalPrice;
    private Quality quality;
    private Place storagePlace;
    private Place deliveryPlace;
    private Network network;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDelayInDays() {
        return delayInDays;
    }

    public void setDelayInDays(Integer delayInDays) {
        this.delayInDays = delayInDays;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(Date validationDate) {
        this.validationDate = validationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDeliveryDelay() {
        return deliveryDelay;
    }

    public void setDeliveryDelay(Integer deliveryDelay) {
        this.deliveryDelay = deliveryDelay;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    public Boolean getIsForSell() {
        return isForSell;
    }

    public void setIsForSell(Boolean isForSell) {
        this.isForSell = isForSell;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOperatorPhone() {
        return operatorPhone;
    }

    public void setOperatorPhone(String operatorPhone) {
        this.operatorPhone = operatorPhone;
    }

    public String getAuthorPhone() {
        return authorPhone;
    }

    public void setAuthorPhone(String authorPhone) {
        this.authorPhone = authorPhone;
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

    public Double getWholesaleUnitPrice() {
        return wholesaleUnitPrice;
    }

    public void setWholesaleUnitPrice(Double wholesaleUnitPrice) {
        this.wholesaleUnitPrice = wholesaleUnitPrice;
    }

    public Double getWholesaleTotalPrice() {
        return wholesaleTotalPrice;
    }

    public void setWholesaleTotalPrice(Double wholesaleTotalPrice) {
        this.wholesaleTotalPrice = wholesaleTotalPrice;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public Place getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(Place storagePlace) {
        this.storagePlace = storagePlace;
    }

    public Place getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(Place deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}
