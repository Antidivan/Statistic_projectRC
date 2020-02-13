package com.company.statisticsprojectrc.service;

import java.util.Date;

public interface OrderNumberGeneratorService {
    String NAME = "statisticsprojectrc_OrderNumberGeneratorService";

    String getOrderNumber();

    String getOrderNumber(Date datedFrom);
}
