package com.company.statisticsprojectrc.service;

import com.company.statisticsprojectrc.entity.ImportLog;
import com.company.statisticsprojectrc.entity.Importer;

import java.util.Map;
import java.util.Set;

public interface ImporterService {
        String NAME = "statisticsprojectrc_ImporterService";

        Set<Importer> getImporters();

        /**
         * @param log          log parameter should have fully loaded file descriptor and related scenario entity
         * @param params       additional parameters that could be used in an importer implementation
         * @param doPersistLog when true - log will be persisted with log records under its scenario
         * @return import log
         */
        ImportLog doImport(ImportLog log, Map<String, Object> params, boolean doPersistLog);
}

