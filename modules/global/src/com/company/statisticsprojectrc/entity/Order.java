package com.company.statisticsprojectrc.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;

@Table(name = "STATISTICSPROJECTRC_ORDER")
@Entity(name = "statisticsprojectrc_ORDER")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 8841246679704730837L;


    @NotNull
    @Column(name = "WEBSITE", nullable = false)
    protected String website;

    @NotNull
    @Column(name = "NUMBER_ORDER", nullable = false)
    protected String numberOrder;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "DATE_CREATE", nullable = false)
    protected Date dateCreate;

    @NotNull
    @Column(name = "PAYMENT_METHOD", nullable = false)
    protected String paymentMethod;

    @PositiveOrZero
    @NotNull
    @Column(name = "COST_FINAL", nullable = false)
    protected Double costFinal;

    @Positive
    @NotNull
    @Column(name = "COST_ORDER", nullable = false)
    protected Double costOrder;

    @NotNull
    @Column(name = "PAID", nullable = false)
    protected Boolean paid = false;

    @NotNull
    @Column(name = "CANCELED", nullable = false)
    protected Boolean canceled = false;

    @NotNull
    @Column(name = "SECTION_", nullable = false)
    protected String section;

    @NotNull
    @Column(name = "PRODUCT", nullable = false)
    protected String product;

    @NotNull
    @Column(name = "HOURS_PAID", nullable = false)
    protected Double hours_paid;

    @NotNull
    @Column(name = "CONSULTANT", nullable = false)
    protected String consultant;

    @NotNull
    @Column(name = "CUSTOMER", nullable = false)
    protected String customer;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_ESTIMATED")
    protected Date dateEstimated;

    @Column(name = "TOWN_ORDER")
    protected String townOrder;

    public Double getHours_paid() {
        return hours_paid;
    }

    public void setHours_paid(Double hours_paid) {
        this.hours_paid = hours_paid;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setTownOrder(String townOrder) {
        this.townOrder = townOrder;
    }

    public String getTownOrder() {
        return townOrder;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Date getDateEstimated() {
        return dateEstimated;
    }

    public void setDateEstimated(Date dateEstimated) {
        this.dateEstimated = dateEstimated;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public Boolean getCanceled() {
        return canceled;
    }

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Double getCostOrder() {
        return costOrder;
    }

    public void setCostOrder(Double costOrder) {
        this.costOrder = costOrder;
    }

    public Double getCostFinal() {
        return costFinal;
    }

    public void setCostFinal(Double costFinal) {
        this.costFinal = costFinal;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

}