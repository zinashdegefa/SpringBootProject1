create table car (
plate_number serial primary key,
car_name varchar(255),
f_year varchar(255),
country varchar(255),
model varchar(255),
price int
);

INSERT INTO car(car_name, f_year, country, model, price)
VALUES ('Ford', '2000', 'USA', 'xx', 30000);

INSERT INTO car(car_name, f_year, country, model, price)
VALUES ('Toyota', '2010', 'Japan', 'xxl', 15000);

select * from cars

drop table car


CREATE TABLE Person (
   person_id serial PRIMARY key,
   first_name varchar(255),
   last_name varchar(255),
   address varchar(255),
   city varchar(255)
   );

INSERT INTO Person (first_name, last_name, address, city)
VALUES ('Zinash', 'Degefa', '123 Street', 'Maryland heights');

INSERT INTO Person (first_name, last_name, address, city)
VALUES ('Metages', 'Firheta', '456 Street', 'Maryland heights');

INSERT INTO Person (first_name, last_name, address, city)
VALUES ('Barkot', 'Gashe', '400 Street', 'Mheights');



