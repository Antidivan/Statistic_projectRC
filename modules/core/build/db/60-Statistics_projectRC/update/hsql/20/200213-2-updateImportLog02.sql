alter table STATISTICSPROJECTRC_IMPORT_LOG add constraint FK_STATISTICSPROJECTRC_IMPORT_LOG_ON_IMPORT_SCENARIO foreign key (IMPORT_SCENARIO_ID) references STATISTICSPROJECTRC_IMPORT_SCENARIO(ID);
create index IDX_STATISTICSPROJECTRC_IMPORT_LOG_ON_IMPORT_SCENARIO on STATISTICSPROJECTRC_IMPORT_LOG (IMPORT_SCENARIO_ID);