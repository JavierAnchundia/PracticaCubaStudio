-- begin UNTITLED_SPEAKER
create table UNTITLED_SPEAKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LAST_NAME varchar(255) not null,
    FIRST_NAME varchar(255) not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end UNTITLED_SPEAKER
-- begin UNTITLED_SESSION
create table UNTITLED_SESSION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOPIC varchar(255) not null,
    START_DATE timestamp not null,
    END_DATE timestamp not null,
    SPEAKER_ID varchar(36) not null,
    DESCRIPTION varchar(2000),
    --
    primary key (ID)
)^
-- end UNTITLED_SESSION
