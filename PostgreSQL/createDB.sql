-- public.account_type definition

-- Drop table

-- DROP TABLE account_type;

CREATE TABLE account_type (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	"name" varchar(100) NOT NULL,
	CONSTRAINT account_type_pkey PRIMARY KEY (id),
	CONSTRAINT uk_h6j4wuyxw7bvqjnjf7cx4pisc UNIQUE (name)
);


-- public.city definition

-- Drop table

-- DROP TABLE city;

CREATE TABLE city (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	"name" varchar(100) NOT NULL,
	CONSTRAINT city_pkey PRIMARY KEY (id),
	CONSTRAINT uk_qsstlki7ni5ovaariyy9u8y79 UNIQUE (name)
);


-- public.concert_type definition

-- Drop table

-- DROP TABLE concert_type;

CREATE TABLE concert_type (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	"name" varchar(100) NOT NULL,
	CONSTRAINT concert_type_pkey PRIMARY KEY (id),
	CONSTRAINT uk_itaod42cvbhsy7agxiyhqve87 UNIQUE (name)
);


-- public."day" definition

-- Drop table

-- DROP TABLE "day";

CREATE TABLE "day" (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	"number" int8 NOT NULL,
	start_date date NULL,
	CONSTRAINT day_pkey PRIMARY KEY (id)
);


-- public.employee definition

-- Drop table

-- DROP TABLE employee;

CREATE TABLE employee (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	"name" varchar(100) NOT NULL,
	surname varchar(100) NOT NULL,
	CONSTRAINT employee_pkey PRIMARY KEY (id)
);


-- public.route definition

-- Drop table

-- DROP TABLE route;

CREATE TABLE route (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	description varchar(100) NOT NULL,
	"name" varchar(100) NOT NULL,
	"number" varchar(100) NOT NULL,
	CONSTRAINT route_pkey PRIMARY KEY (id),
	CONSTRAINT uk_sq00o0gotg7jcw7154uvugfq5 UNIQUE (name)
);


-- public.team definition

-- Drop table

-- DROP TABLE team;

CREATE TABLE team (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	"name" varchar(100) NOT NULL,
	CONSTRAINT team_pkey PRIMARY KEY (id),
	CONSTRAINT uk_g2l9qqsoeuynt4r5ofdt1x2td UNIQUE (name)
);


-- public.account definition

-- Drop table

-- DROP TABLE account;

CREATE TABLE account (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	email varchar(100) NOT NULL,
	"name" varchar(100) NOT NULL,
	"password" varchar(100) NOT NULL,
	id_account_type int8 NOT NULL,
	CONSTRAINT account_pkey PRIMARY KEY (id),
	CONSTRAINT uk_q0uja26qgu1atulenwup9rxyr UNIQUE (email),
	CONSTRAINT fkqfhija8ywdfrwlgdg6d0torqu FOREIGN KEY (id_account_type) REFERENCES account_type(id)
);


-- public.route_day definition

-- Drop table

-- DROP TABLE route_day;

CREATE TABLE route_day (
	id bigserial NOT NULL,
	id_day int8 NULL,
	id_route int8 NULL,
	CONSTRAINT route_day_pkey PRIMARY KEY (id),
	CONSTRAINT fkn3k8rnt7vyh8vkrcfx2uf0jmj FOREIGN KEY (id_route) REFERENCES route(id),
	CONSTRAINT fkq0p8eu9mav3iqnhmo4lcspg0o FOREIGN KEY (id_day) REFERENCES "day"(id)
);


-- public.school definition

-- Drop table

-- DROP TABLE school;

CREATE TABLE school (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	building_number varchar(10) NULL,
	description varchar(255) NULL,
	"name" varchar(100) NOT NULL,
	phone_number varchar(15) NULL,
	street varchar(100) NULL,
	id_city int8 NOT NULL,
	CONSTRAINT school_pkey PRIMARY KEY (id),
	CONSTRAINT uk_251hwtk4rvkoblr76wknh8v41 UNIQUE (name),
	CONSTRAINT fk15yhy8ywibytpc6gm49c8tt9a FOREIGN KEY (id_city) REFERENCES city(id)
);


-- public.team_employee definition

-- Drop table

-- DROP TABLE team_employee;

CREATE TABLE team_employee (
	id bigserial NOT NULL,
	id_employee int8 NULL,
	id_team int8 NULL,
	CONSTRAINT team_employee_pkey PRIMARY KEY (id),
	CONSTRAINT fkcd3rbkpnqf5kcau4hh6x0dbg0 FOREIGN KEY (id_employee) REFERENCES employee(id),
	CONSTRAINT fkegp5bihkeb6h905wc4qf2s7xi FOREIGN KEY (id_team) REFERENCES team(id)
);


-- public.concert definition

-- Drop table

-- DROP TABLE concert;

CREATE TABLE concert (
	id bigserial NOT NULL,
	"version" int4 NOT NULL DEFAULT 1,
	"number" int8 NOT NULL,
	time_end timestamp(6) NULL,
	time_start timestamp(6) NULL,
	id_concert_type int8 NOT NULL,
	id_school int8 NOT NULL,
	CONSTRAINT concert_pkey PRIMARY KEY (id),
	CONSTRAINT fk3qwdnbyf1uj4h4rk2nsfijaet FOREIGN KEY (id_school) REFERENCES school(id),
	CONSTRAINT fkcd4dj31rke6jjwvudi2qqb54x FOREIGN KEY (id_concert_type) REFERENCES concert_type(id)
);


-- public.concert_day definition

-- Drop table

-- DROP TABLE concert_day;

CREATE TABLE concert_day (
	id bigserial NOT NULL,
	id_concert int8 NULL,
	id_day int8 NULL,
	CONSTRAINT concert_day_pkey PRIMARY KEY (id),
	CONSTRAINT fkpl99v29r3jq3v4vqfo9048h1m FOREIGN KEY (id_day) REFERENCES "day"(id),
	CONSTRAINT fktmp70qumfgal1w2clslql7tcb FOREIGN KEY (id_concert) REFERENCES concert(id)
);

insert into city("name")
values
('Kraków'),
('Rzeszów'),
('Łódź'),
('Warszawa'),
('Katowice'),
('Poznań'),
('Gdańsk'),
('Gdynia'),
('Lublin'),
('Bydgoszcz'),
('Mysłowice'),
('Białystok')

;

insert into school(building_number,description,"name",phone_number,street,id_city)
values
('12A','Lorem Ipsum','Szkoła Podstawowa im. Jana Kowalskiego','225400850','Kilińskiego',1),
('1B','Lorem Ipsum','Gimnazjum nr 3 im. Marii Skłodowskiej-Curie','685268044','Piwna',1),
('15C','Lorem Ipsum','Liceum Ogólnokształcące im. Adama Mickiewicza','901134339','Sucharskiego',3),
('17D','Lorem Ipsum','Zespół Szkół Technicznych i Licealnych im. Stanisława Staszica','528168154','Leśna',4),
('2E','Lorem Ipsum','Szkoła Podstawowa nr 7 z Oddziałami Integracyjnymi','700327231','Kosynierów',5),
('7F','Lorem Ipsum','Liceum Profilowane nr 2 z Oddziałami Dwujęzycznymi','316529053','Piastowska',6),
('5','Lorem Ipsum','Gimnazjum i Szkoła Ponadgimnazjalna im. Tadeusza Kościuszki','191908823','Kasztanowa',7),
('8','Lorem Ipsum','Zespół Szkół Rolniczych i Agrotechnicznych','412445279','Różana',8),
('10','Lorem Ipsum','Szkoła Podstawowa Specjalna nr 5 im. Henryka Sienkiewicza','325088083','Orzechowa',9),
('2C','Lorem Ipsum','Liceum Plastyczne im. Józefa Chełmońskiego','853943826','Sosnowa',10),
('21','Lorem Ipsum','Gimnazjum Muzyczne im. Fryderyka Chopina','909813555','Niecała',11),
('7D','Lorem Ipsum','Zespół Szkół Sportowych i Rekreacyjnych','687999553','Grunwaldzka',12)
;

insert into concert_type("name")
values
('K30'),
('K45'),
('A30'),
('A45');

insert into concert("number",time_start,time_end,id_concert_type,id_school)
values
(1,'2022-10-10 14:30:30','2022-10-10 18:30:30',1,1),
(1,'2022-1-24 8:30:30','2022-1-24 12:30:30',3,3),
(1,'2022-3-15 11:30:30','2022-3-15 15:30:30',4,6),
(1,'2022-10-10 12:30:30','2022-10-10 16:30:30',3,4),
(1,'2022-10-10 8:30:30','2022-10-10 12:30:30',2,5),
(1,'2022-10-10 16:30:30','2022-10-10 20:30:30',1,8),
(1,'2022-10-10 17:30:30','2022-10-10 21:30:30',2,7),
(1,'2022-10-10 18:30:30','2022-10-10 22:30:30',4,9),
(1,'2022-10-10 16:30:30','2022-10-10 20:30:30',2,1),
(1,'2022-10-10 14:30:30','2022-10-10 18:30:30',1,2)
;

insert into
"day"("number",start_date)
values
(1,'2022-10-10'),
(1,'2022-1-24'),
(1,'2022-3-15'),
(1,'2022-12-4'),
(1,'2022-5-17'),
(1,'2023-6-1'),
(1,'2023-7-21'),
(1,'2023-8-30'),
(1,'2023-4-26'),
(1,'2023-11-15')
;

insert into
concert_day(id_concert,id_day)
values
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10)
;

insert into
route(description,"name","number")
values
('Lorem Ipsum','Kraków-Rzeszów',1),
('Lorem Ipsum','Wrocław-Kraków',2),
('Lorem Ipsum','Wrocław-Warszawa',3),
('Lorem Ipsum','Kraków-Warszawa',4),
('Lorem Ipsum','Warszawa-Poznań',5),
('Lorem Ipsum','Kraków-Poznań',6),
('Lorem Ipsum','Gdańsk-Kraków',7),
('Lorem Ipsum','Łódź-Kraków',8),
('Lorem Ipsum','Wrocław-Łódź',9),
('Lorem Ipsum','Warszawa',10)
;

insert into
route_day(id_day,id_route)
values
(1,2),
(2,3),
(4,1),
(3,4),
(5,8),
(7,5),
(6,6),
(8,9),
(9,8),
(10,10)
;

insert into
account_type(name)
values
('Customer'),
('Employee'),
('Admin')
;

insert into
account(email,"name","password",id_account_type)
values
('example1@gmail.com', 'John Doe', 'pass123',1),
('example2@yahoo.com', 'Jane Smith', 'abc456',1),
('example3@hotmail.com', 'David Johnson', 'qwerty',1),
('example4@outlook.com', 'Sarah Wilson', 'password123',2),
('example5@gmail.com', 'Michael Brown', 'securepass',2),
('example6@yahoo.com', 'Emily Davis', 'p@ssw0rd',2),
('example7@hotmail.com', 'Christopher Taylor', 'hello123',2),
('example8@outlook.com', 'Olivia Anderson', 'letmein',2),
('example9@gmail.com', 'Daniel Martinez', 'test456',3),
('example10@yahoo.com', 'Sophia Thomas', 'mysecretpass',3)
;

insert into
team("name")
values
('A'),
('B'),
('C'),
('D'),
('E')
;

insert into
employee("name",surname)
values
('John', 'Doe'),
('Jane', 'Smith'),
('David', 'Johnson'),
('Sarah', 'Wilson'),
('Michael', 'Brown'),
('Emily', 'Davis'),
('Christopher', 'Taylor'),
('Olivia', 'Anderson'),
('Daniel', 'Martinez'),
('Sophia', 'Thomas');

insert into
team_employee(id_employee,id_team)
values
(1,1),
(2,1),
(3,1),
(4,2),
(5,2),
(6,2),
(7,3),
(8,4),
(9,4),
(10,5)
;