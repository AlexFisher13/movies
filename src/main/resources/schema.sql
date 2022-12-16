create table actor (id bigint not null, birth date, name varchar(255), primary key (id));
create table actor_seq (next_val bigint);
insert into actor_seq values ( 1 );
create table movie (id bigint not null, duration integer, rating float(53), release_date date, title varchar(255), primary key (id));
create table movie_actors (movie_id bigint not null, actors_id bigint not null, primary key (movie_id, actors_id));
create table movie_seq (next_val bigint);
insert into movie_seq values ( 1 );
alter table movie_actors add constraint FKoxmxj61v0a9qs12vboo8rxpno foreign key (actors_id) references actor (id);
alter table movie_actors add constraint FKbsto8yef4btokhveihmkg8876 foreign key (movie_id) references movie (id);