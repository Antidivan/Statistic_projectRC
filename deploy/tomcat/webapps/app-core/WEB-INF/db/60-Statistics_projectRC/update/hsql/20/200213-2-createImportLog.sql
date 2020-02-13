alter table STATISTICSPROJECTRC_IMPORT_LOG add constraint FK_STATISTICSPROJECTRC_IMPORT_LOG_ON_FILE foreign key (FILE_ID) references SYS_FILE(ID);
alter table STATISTICSPROJECTRC_IMPORT_LOG add constraint FK_STATISTICSPROJECTRC_IMPORT_LOG_ON_IMPORT_SCENARIO foreign key (IMPORT_SCENARIO_ID) references STATISTICSPROJECTRC_IMPORT_SCENARIO(ID);
create index IDX_STATISTICSPROJECTRC_IMPORT_LOG_ON_FILE on STATISTICSPROJECTRC_IMPORT_LOG (FILE_ID);
create index IDX_STATISTICSPROJECTRC_IMPORT_LOG_ON_IMPORT_SCENARIO on STATISTICSPROJECTRC_IMPORT_LOG (IMPORT_SCENARIO_ID);