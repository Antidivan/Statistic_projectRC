alter table STATISTICSPROJECTRC_IMPORT_SCENARIO add constraint FK_STATISTICSPROJECTRC_IMPORT_SCENARIO_ON_TEMPLATE foreign key (TEMPLATE_ID) references SYS_FILE(ID);
create index IDX_STATISTICSPROJECTRC_IMPORT_SCENARIO_ON_TEMPLATE on STATISTICSPROJECTRC_IMPORT_SCENARIO (TEMPLATE_ID);
