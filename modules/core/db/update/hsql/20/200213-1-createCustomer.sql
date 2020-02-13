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
);