-- begin STATISTICSPROJECTRC_ORDER
create table STATISTICSPROJECTRC_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    WEBSITE varchar(255) not null,
    NUMBER_ORDER varchar(255) not null,
    DATE_CREATE timestamp not null,
    PAYMENT_METHOD varchar(255) not null,
    COST_FINAL double precision not null,
    COST_ORDER double precision not null,
    PAID boolean not null,
    CANCELED boolean not null,
    SECTION_ varchar(255) not null,
    PRODUCT varchar(255) not null,
    HOURS_PAID double precision not null,
    CONSULTANT varchar(255) not null,
    CUSTOMER varchar(255) not null,
    DATE_ESTIMATED date,
    TOWN_ORDER varchar(255),
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_ORDER
-- begin STATISTICSPROJECTRC_CONSULTANT
create table STATISTICSPROJECTRC_CONSULTANT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_consultant varchar(32),
    FULL_NAME_CONSULTANT varchar(255) not null,
    EMAIL_WORK varchar(255) not null,
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_CONSULTANT
-- begin STATISTICSPROJECTRC_USER
create table STATISTICSPROJECTRC_USER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER integer not null,
    EMAIL_USER varchar(255) not null,
    BIRTHDAY date,
    FIRST_MEETING date,
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_USER

-- begin STATISTICSPROJECTRC_IMPORT_LOG
create table STATISTICSPROJECTRC_IMPORT_LOG (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FILE_ID varchar(36) not null,
    STARTED timestamp,
    FINISHED timestamp,
    ENTITIES_PROCESSED integer,
    IMPORT_SCENARIO_ID varchar(36),
    COMMENT_ longvarchar,
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_IMPORT_LOG
-- begin STATISTICSPROJECTRC_IMPORT_SCENARIO
create table STATISTICSPROJECTRC_IMPORT_SCENARIO (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TEMPLATE_ID varchar(36) not null,
    COMMENT_ longvarchar,
    IMPORTER_BEAN_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_IMPORT_SCENARIO
-- begin STATISTICSPROJECTRC_IMPORT_LOG_RECORD
create table STATISTICSPROJECTRC_IMPORT_LOG_RECORD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MESSAGE varchar(255) not null,
    LEVEL_ varchar(50) not null,
    TIME_ timestamp not null,
    STACKTRACE longvarchar,
    IMPORT_LOG_ID varchar(36),
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_IMPORT_LOG_RECORD
-- begin STATISTICSPROJECTRC_CUSTOMER
create table STATISTICSPROJECTRC_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(50) not null,
    SECOND_NAME varchar(50) not null,
    DOCUMENT_NUMBER varchar(50) not null,
    DESCRIPTION longvarchar,
    PRIORITY integer,
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_CUSTOMER
-- begin STATISTICSPROJECTRC_IMPORT_LOG_RECORD
create table STATISTICSPROJECTRC_IMPORT_LOG_RECORD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MESSAGE varchar(255) not null,
    LEVEL_ varchar(50) not null,
    TIME_ timestamp not null,
    STACKTRACE longvarchar,
    IMPORT_LOG_ID varchar(36),
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_IMPORT_LOG_RECORD
-- begin STATISTICSPROJECTRC_IMPORTER
create table STATISTICSPROJECTRC_IMPORTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BEAN_NAME varchar(255) not null,
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end STATISTICSPROJECTRC_IMPORTER
