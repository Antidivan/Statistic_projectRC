package com.company.statisticsprojectrc.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|description")
@Table(name = "STATISTICSPROJECTRC_IMPORTER")
@Entity(name = "statisticsprojectrc_Importer")
public class Importer extends StandardEntity {
    private static final long serialVersionUID = 5109889638267002092L;

    @NotNull
    @Column(name = "BEAN_NAME", nullable = false)
    protected String beanName;

    @Column(name = "DESCRIPTION")
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}