

-- Query: Create 5 different users: Jane Amsden, Emily Dixon, Theodore Dostoevsky, William Shapiro, Lao Xiu
INSERT into users (first_name,last_name)
VALUES 	("Jane","Amsden"),
		("Emily","Dixon"), 
		("Theodore","Dostoevsky"), 
		("William","Shapiro"), 
		("Lao","Xiu");


-- Query: Create 5 books with the following names: C Sharp, Java, Python, PHP, Ruby
INSERT into books (title)
VALUES 	("C Sharp"),
		("Java"), 
		("Python"), 
		("PHP"), 
		("Ruby");

-- Query: Change the name of the C Sharp book to C#
-- select * from books;
UPDATE books
SET title = "C#" 
WHERE id = 1;

-- Query: Change the first name of the 4th user to Bill
-- select * from users;
UPDATE users
SET first_name = "Bill" 
WHERE id = 4;

-- Query: Have the first user favorite the first 2 books
INSERT into favorites (user_id,book_id)
VALUES 	(1,1),
		(1,2);

-- Query: Have the second user favorite the first 3 books
INSERT into favorites (user_id,book_id)
VALUES 	(2,1),
		(2,2),
        (2,3);

-- Query: Have the third user favorite the first 4 books
INSERT into favorites (user_id,book_id)
VALUES 	(3,1),
		(3,2),
        (3,3),
        (3,4);
        
-- Query: Have the fourth user favorite all the books
INSERT into favorites (user_id,book_id)
VALUES 	(4,1),
		(4,2),
        (4,3),
        (4,4),
        (4,5);

-- Query: Retrieve all the users who favorited the 3rd book
SELECT *
FROM users
JOIN favorites ON favorites.user_id = users.id
WHERE favorites.book_id = 3;

 
-- Query: Remove the first user of the 3rd book's favorites
SET SQL_SAFE_UPDATES = 0;

DELETE from favorites 
WHERE favorites.user_id  = 2;

-- Query: Have the 5th user favorite the 2nd book
INSERT into favorites (user_id,book_id)
VALUES 	(5,2);

-- Find all the books that the 3rd user favorited
SELECT title
FROM books
JOIN favorites ON favorites.book_id = books.id
WHERE favorites.user_id = 3;

-- Query: Find all the users that favorited to the 5th book
SELECT first_name, last_name
FROM users
JOIN favorites ON favorites.user_id = users.id
WHERE favorites.book_id = 5;

