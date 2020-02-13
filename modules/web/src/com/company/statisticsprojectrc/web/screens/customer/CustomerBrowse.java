package com.company.statisticsprojectrc.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.statisticsprojectrc.entity.Customer;

@UiController("statisticsprojectrc_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}