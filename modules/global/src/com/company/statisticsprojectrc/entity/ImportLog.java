package com.company.statisticsprojectrc.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NamePattern("%s %s|started,finished")
@Table(name = "STATISTICSPROJECTRC_IMPORT_LOG")
@Entity(name = "statisticsprojectrc_ImportLog")
public class ImportLog extends StandardEntity {
    private static final long serialVersionUID = -391878070200178425L;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "FILE_ID"
    )
    protected FileDescriptor file;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(
            name = "STARTED"
    )
    protected Date started;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(
            name = "FINISHED"
    )
    protected Date finished;

    @Column(
            name = "ENTITIES_PROCESSED"
    )
    protected Integer entitiesProcessed;

    @OneToMany(
            mappedBy = "importLog"
    )
    protected List<ImportLogRecord> records;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "IMPORT_SCENARIO_ID"
    )
    protected ImportScenario importScenario;

    @Lob
    @Column(
            name = "COMMENT_"
    )
    protected String comment;

    public ImportLog() {
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return this.comment;
    }

    public void setFile(FileDescriptor file) {
        this.file = file;
    }

    public FileDescriptor getFile() {
        return this.file;
    }

    public void setImportScenario(ImportScenario importScenario) {
        this.importScenario = importScenario;
    }

    public ImportScenario getImportScenario() {
        return this.importScenario;
    }

    public void setEntitiesProcessed(Integer entitiesProcessed) {
        this.entitiesProcessed = entitiesProcessed;
    }

    public Integer getEntitiesProcessed() {
        return this.entitiesProcessed;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getStarted() {
        return this.started;
    }

    public void setFinished(Date finished) {
        this.finished = finished;
    }

    public Date getFinished() {
        return this.finished;
    }

    public void setRecords(List<ImportLogRecord> records) {
        this.records = records;
    }

    public List<ImportLogRecord> getRecords() {
        return this.records;
    }
}