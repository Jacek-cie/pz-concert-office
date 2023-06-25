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


insert into city (name) values('Leszno')

insert into account_type (name) values('Admin'),('User')
insert into account(email,name,"password",id_account_type) values ('jacek@wp.pl','Jacek','1234',1),('jakub@wp.pl','Jakub','4321',2)