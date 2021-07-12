
create table if not exists dev.T_USER (
  ID bigint(10) unsigned not null auto_increment,
  USERNAME varchar(20) not null,
  PASSWORD varchar(255) not null,
  ROLE varchar(20) not null,
  primary key (ID)
);