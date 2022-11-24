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

drop table users;
delete from users;



