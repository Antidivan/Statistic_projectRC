alter table STATISTICSPROJECTRC_IMPORT_LOG_RECORD add constraint FK_STATISTICSPROJECTRC_IMPORT_LOG_RECORD_ON_IMPORT_LOG foreign key (IMPORT_LOG_ID) references STATISTICSPROJECTRC_IMPORT_LOG(ID);
create index IDX_STATISTICSPROJECTRC_IMPORT_LOG_RECORD_ON_IMPORT_LOG on STATISTICSPROJECTRC_IMPORT_LOG_RECORD (IMPORT_LOG_ID);