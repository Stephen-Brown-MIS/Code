
-- Create 3 new dojos
insert into dojos (name) values
("House Brown"),
("House Smith"),
("House Beatty");

-- Delete the 3 dojos you just created
delete from dojos where ID > 0;

-- Query: Create 3 more dojos
insert into dojos (name) values
("House Jones"),
("House Casteel"),
("House Martino");

-- Create 3 ninjas that belong to the first dojo
insert into ninjas (first_name,last_name,age,dojo_id) values
("Scott","Jones",55,4),
("Jennifer","Jones",55,4),
("Mason","Jones",13,4);

select * from dojos;

-- Query: Create 3 ninjas that belong to the second dojo
insert into ninjas (first_name,last_name,age,dojo_id) values
("Suzanne","Casteel",67,5),
("Jim","Casteel",77,5),
("Mary","Casteel",21,5);

-- Query: Create 3 ninjas that belong to the third dojo
insert into ninjas (first_name,last_name,age,dojo_id) values
("Judith","Martino",58,6),
("Jill","Martino",48,6),
("Jaime","Martino",57,6);

-- Query: Retrieve all the ninjas from the first dojo
select * from ninjas
where dojo_id = 4;

-- Query: Retrieve all the ninjas from the last dojo
Select * from ninjas users
where dojo_id = 5;

-- Query: Retrieve the last ninja's dojo
Select * from ninjas 
where dojo_id = 6;