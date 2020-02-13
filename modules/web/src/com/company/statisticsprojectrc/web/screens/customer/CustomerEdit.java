package com.company.statisticsprojectrc.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.statisticsprojectrc.entity.Customer;

@UiController("statisticsprojectrc_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}