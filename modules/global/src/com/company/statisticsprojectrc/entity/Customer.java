package com.company.statisticsprojectrc.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;


@NamePattern("%s %s|firstName,secondName")
@Table(name = "STATISTICSPROJECTRC_CUSTOMER")
@Entity(name = "statisticsprojectrc_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -4419503573144791826L;

    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    protected String firstName;

    @Column(name = "SECOND_NAME", nullable = false, length = 50)
    protected String secondName;

    @Column(name = "DOCUMENT_NUMBER", nullable = false, length = 50)
    protected String documentNumber;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "PRIORITY")
    protected Integer priority;

    public void setPriority(CustomerPriority priority) {
        this.priority = priority == null ? null : priority.getId();
    }

    public CustomerPriority getPriority() {
        return priority == null ? null : CustomerPriority.fromId(priority);
    }


    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }


}