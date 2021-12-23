-- begin SQLCUBA_PARENT
create table SQLCUBA_PARENT (
    ID uuid,
    --
    NAME varchar(255) not null,
    AGE integer not null,
    --
    primary key (ID)
)^
-- end SQLCUBA_PARENT
-- begin SQLCUBA_CHILD
create table SQLCUBA_CHILD (
    ID uuid,
    --
    NAME varchar(255) not null,
    PARENT_ID uuid not null,
    AGE integer not null,
    --
    primary key (ID)
)^
-- end SQLCUBA_CHILD
