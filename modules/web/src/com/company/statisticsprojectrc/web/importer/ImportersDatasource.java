package com.company.statisticsprojectrc.web.importer;

import com.company.statisticsprojectrc.entity.Importer;
import com.company.statisticsprojectrc.service.ImporterService;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.gui.data.impl.CustomCollectionDatasource;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class ImportersDatasource extends CustomCollectionDatasource<Importer, UUID> {

    private ImporterService importerService = AppBeans.get(ImporterService.NAME);

    @Override
    protected Collection<Importer> getEntities(Map<String, Object> params) {
        return importerService.getImporters();
    }
}
