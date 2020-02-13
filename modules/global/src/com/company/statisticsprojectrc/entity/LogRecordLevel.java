package com.company.statisticsprojectrc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum LogRecordLevel implements EnumClass<String> {


    ERROR("error"),
    WARN("warn"),
    DEBUG("debug");

    private String id;

    private LogRecordLevel(String value) {
        this.id = value;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public static LogRecordLevel fromId(String id) {
        LogRecordLevel[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            LogRecordLevel at = var1[var3];
            if (at.getId().equals(id)) {
                return at;
            }
        }

        return null;
    }
}