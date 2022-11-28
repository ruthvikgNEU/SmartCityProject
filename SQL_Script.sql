create database test;
use test;

create table users(
user_id integer auto_increment,
firstname varchar(20),
lastname varchar(20),
username varchar(15),
email varchar(30),
passwordFld varchar(20),
verify_code integer,
can_login boolean default false,
primary key(user_id)
);

insert into users(firstname,lastname,username,email,passwordFld,verify_code) values("Ruthvik","Garlapati","ruthvikg31","garlapati.r@northeastern.edu","password",123456);
insert into users(firstname,lastname,username,email,passwordFld,verify_code) values("Ruthvik","Garlapati","Kdebruyne17","ruthvik@gmail.com","password",123456);
select * from users;


update users set username = 'Username' where user_id = 1;



create table theatres(
theatre_id integer auto_increment,
name varchar(25),
location varchar(20),
primary key(theatre_id)
);

drop table theatres;

insert into theatres(name,location) values('Prasad IMAX','Boston');
insert into theatres(name,location) values('AMC IMAX','New York');

create table movies(
movie_id integer auto_increment,
name varchar(15),
theatre_id integer,
primary key(movie_id)
);

insert into movies(name,theatre_id) values('Avatar',1);
insert into movies(name,theatre_id) values('Black Panther',1);
insert into movies(name,theatre_id) values('HIT 2',1);

insert into movies(name,theatre_id) values('Love Today',2);
insert into movies(name,theatre_id) values('Black Adam',2);

create table shows(
show_id integer auto_increment,
show_time varchar(15),
movie_id integer,
no_of_tickets integer default 50,
primary key(show_id)
);





select * from movies where theatre_id = 1;