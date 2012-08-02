# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table country (
  id                        varchar(255) not null,
  isoname                   varchar(255),
  constraint pk_country primary key (id))
;

create sequence country_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists country;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists country_seq;

