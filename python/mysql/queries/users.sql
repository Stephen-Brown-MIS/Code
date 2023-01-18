-- Select all users
Select * from users;

-- Insert several users into the table	
Insert into users (first_name,last_name,email) VALUES
("Steve","Brown","steve@meail.com"),
("Louise","Brown","louise@meail.com"),
("Madison","Brown","madison@meail.com");

-- Retrieve the first user using their email address
Select * from users
where email = "steve@meail.com";

-- Retrieve the last user using their id
Select * from users
order by id desc limit 1;

-- Change the user with id=3 so their last name is Pancakes
update users 
set last_name="pancakes"
where id =3; 

-- Delete the user with id=2 from the database
Delete from users where id = 2;

-- Get all the users, sorted by their first name in descending order
Select * from users
order by last_name desc;
