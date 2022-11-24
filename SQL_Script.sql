use test;

create table users(
firstname varchar(20),
lastname varchar(20),
username varchar(10),
email varchar(30),
passwordFld varchar(20),
verify_code integer,
can_login boolean default false
);

insert into users(firstname,lastname,username,email,passwordFld,verify_code) values("Ruthvik","Garlapati","ruthvikg31","garlapati.r@northeastern.edu","password",123456);
select * from users;

drop table users;
delete from users;



