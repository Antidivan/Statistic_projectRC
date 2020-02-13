package com.company.statisticsprojectrc.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "STATISTICSPROJECTRC_IMPORT_LOG_RECORD")
@Entity(name = "statisticsprojectrc_ImportLogRecord")
public class ImportLogRecord extends StandardEntity {
    private static final long serialVersionUID = 5175305737162241070L;
    @Column(
            name = "MESSAGE",
            nullable = false
    )
    protected String message;
    @Column(
            name = "LEVEL_",
            nullable = false
    )
    protected String level;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(
            name = "TIME_",
            nullable = false
    )
    protected Date time;
    @Lob
    @Column(
            name = "STACKTRACE"
    )
    protected String stacktrace;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "IMPORT_LOG_ID"
    )
    protected ImportLog importLog;

    public ImportLogRecord() {
    }

    public void setImportLog(ImportLog importLog) {
        this.importLog = importLog;
    }

    public ImportLog getImportLog() {
        return this.importLog;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setLevel(LogRecordLevel level) {
        this.level = level == null ? null : level.getId();
    }

    public LogRecordLevel getLevel() {
        return this.level == null ? null : LogRecordLevel.fromId(this.level);
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return this.time;
    }

    public void setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
    }

    public String getStacktrace() {
        return this.stacktrace;
    }
}