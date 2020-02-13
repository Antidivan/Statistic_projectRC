package com.company.statisticsprojectrc.service;

import com.company.statisticsprojectrc.entity.ImportLog;
import com.haulmont.cuba.core.entity.FileDescriptor;

import java.util.Map;

public interface ImporterAPI {
    /**
     *
     * @param fileDescriptor Descriptor of the file to import from
     */
    void setFileDescriptor(FileDescriptor fileDescriptor);

    /**
     * @param params
     * @return Number of entities persisted
     */
    ImportLog doImport(ImportLog log, Map<String, Object> params);
}
