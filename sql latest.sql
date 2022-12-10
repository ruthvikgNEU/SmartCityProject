
drop database if exists test;
create database test;
use test;
drop table if exists users;
drop table if exists theatres;
drop table if exists movies;
drop table if exists shows;
drop table if exists bookings;
drop table if exists companies;
drop table if exists jobs;
drop table if exists applications;
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



create table companies(
company_id integer auto_increment,
name varchar(30),
primary key(company_id)
);
create table jobs(
job_id integer auto_increment,
name varchar(20),
description varchar(200),
company_id integer,
primary key(job_id)
);
create table applications(
application_id integer auto_increment,
username varchar(20),
company_name varchar(20),
job_name varchar(30),
applied_date varchar(30),
status varchar(20),
comments varchar(200),
primary key(application_id)
);

create table universityapplication(
univapplication_id integer auto_increment,
univname varchar(20),
principal_name varchar(20),
Treasurer_name varchar(30),
applied_date varchar(30),
status varchar(20),
course_info varchar(200),
primary key(univapplication_id)
);

insert into users(firstname,lastname,username,email,passwordFld,verify_code,can_login,role) values("Ruthvik","Garlapati","ruthvikg31","garlapati.r@northeastern.edu","password",123456,1,"User");
insert into users(firstname,lastname,username,email,passwordFld,verify_code,can_login,role) values("Ruthvik","Garlapati","SysAdmin","ruthvik@gmail.com","password",123456,1,"SystemAdmin");
insert into users(firstname,lastname,username,email,passwordFld,verify_code,can_login,role) values("Ruthvik","Garlapati","gadmin","ruthvik@yahoo.com","password",123456,1,"gadmin");
insert into users(firstname,lastname,username,email,passwordFld,verify_code,can_login,role) values("Ruthvik","Garlapati","censoradmin","ruthvik@yahoo.com","password",123456,1,"censoradmin");
insert into users(firstname,lastname,username,email,passwordFld,verify_code,can_login,role) values("Ruthvik","Garlapati","mcreator","ruthvik@yahoo.com","password",123456,1,"mcreator");
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

insert into companies(name) values("Google");
insert into companies(name) values("Meta");
insert into companies(name) values("Apple");
insert into jobs(name,description,company_id) values ("Software Engineer","Java,MySQL,Python",1);
insert into jobs(name,description,company_id) values ("Databse Engineer",",Oracle,MySQL,Python",1);
insert into jobs(name,description,company_id) values ("Product Engineer","Java,UI/UX",1);
insert into jobs(name,description,company_id) values ("Software Engineer","Swift,Scala",3);
insert into jobs(name,description,company_id) values ("Frontend Engineer","HTML,CSS",3);
insert into jobs(name,description,company_id) values ("Metaverse Engineer","AWS,Cloud",2);


select * from jobs;
select j.name,j.description from companies c ,jobs j where c.company_id = j.company_id and c.name = 'Google';
select j.description from companies c ,jobs j where c.company_id = j.company_id and c.name = 'Google' and j.name = 'Software Engineer';

select * from applications;

select * from users;


create table censor_applications(
application_id integer auto_increment,
Movie_Name varchar(20),
theatre varchar(20),
director varchar(30),
studio varchar(30),
app_status varchar(20),
movie_status varchar(20),
applied_date date,
url varchar(100),
primary key(application_id)
);

insert into censor_applications(theatre,movie_name,director,studio,app_status,movie_status,applied_date,url) values ("Imax 3D","Avengers","Kevin Feige","Marvel Studios","Active","Pending","2022-12-08","https://www.youtube.com/watch?v=TcMBFSGVi1c");

select * from censor_applications;


select * from censor_applications  where app_status = 'Active' or app_status = 'Pending' order by applied_date asc;
select * from users 