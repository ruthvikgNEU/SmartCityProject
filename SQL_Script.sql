
drop database if exists test;
create database test;
use test;
drop table if exists users;
drop table if exists theatres;
drop table if exists movies;
drop table if exists shows;
drop table if exists bookings;
create table users(
user_id integer auto_increment,
firstname varchar(20),
lastname varchar(20),
username varchar(15),
email varchar(30),
passwordFld varchar(20),
verify_code integer,
can_login boolean default false,
role varchar(20),
primary key(user_id)
);
create table theatres(
theatre_id integer auto_increment,
name varchar(25),
location varchar(20),
lat double,
lon double,
primary key(theatre_id)
);
create table movies(
movie_id integer auto_increment,
name varchar(15),
theatre_id integer,
primary key(movie_id)
);
create table shows(
show_id integer auto_increment,
show_time varchar(15),
movie_id integer,
no_of_tickets integer default 50,
primary key(show_id)
);
create table bookings(
booking_id integer auto_increment,
user_id integer,
enterprize varchar(15),
lat double,
lon double,
primary key(booking_id)
);
insert into users(firstname,lastname,username,email,passwordFld,verify_code,can_login,role) values("Ruthvik","Garlapati","ruthvikg31","garlapati.r@northeastern.edu","password",123456,1,"User");
insert into users(firstname,lastname,username,email,passwordFld,verify_code,can_login,role) values("Ruthvik","Garlapati","SysAdmin","ruthvik@gmail.com","password",123456,1,"SystemAdmin");
update users set username = 'Username' where user_id = 1;
update users set can_login = 1 where user_id = 1;
insert into theatres(name,location,lat,lon) values('Prasad IMAX','Boston',42.3410701,-71.0882683);
insert into theatres(name,location,lat,lon) values('AMC IMAX','New York',42.3410701,-71.0882683);
insert into movies(name,theatre_id) values('Avatar',1);
insert into movies(name,theatre_id) values('Black Panther',1);
insert into movies(name,theatre_id) values('HIT 2',1);
insert into movies(name,theatre_id) values('Love Today',2);
insert into movies(name,theatre_id) values('Black Adam',2);
insert into shows(show_time,movie_id) values("11:00 AM",1);
insert into shows(show_time,movie_id) values("11:15 AM",1);
insert into shows(show_time,movie_id) values("11:30 AM",1);
insert into shows(show_time,movie_id) values("02:00 PM",2);
insert into shows(show_time,movie_id) values("02:15 PM",2);

insert into bookings(user_id,enterprize,lat,lon) values (1,"Movies",42.3410701,-71.0882683);
insert into bookings(user_id,enterprize,lat,lon) values (1,"Movies",42.3432429,-71.0979135);
select * from users;
Select username,passwordFld,can_login,role from users;