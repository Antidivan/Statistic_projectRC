package com.company.statisticsprojectrc.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "STATISTICSPROJECTRC_CONSULTANT")
@Entity(name = "statisticsprojectrc_Consultant")
public class Consultant extends StandardEntity {
    private static final long serialVersionUID = -3996728477146518417L;

    @Column(name = "USER_consultant", length = 32)
    protected String user;

    @NotNull
    @Column(name = "FULL_NAME_CONSULTANT", nullable = false, unique = true)
    protected String fullNameConsultant;

    @Email
    @NotNull
    @Column(name = "EMAIL_WORK", nullable = false, unique = true)
    protected String emailWork;

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setFullNameConsultant(String fullNameConsultant) {
        this.fullNameConsultant = fullNameConsultant;
    }

    public String getFullNameConsultant() {
        return fullNameConsultant;
    }

    public String getEmailWork() {
        return emailWork;
    }

    public void setEmailWork(String emailWork) {
        this.emailWork = emailWork;
    }

}