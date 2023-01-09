num1 = 42  # variable declaration - integer
num2 = 2.3 # variable declaration - float
boolean = True # variable declaration - boolean
string = 'Hello World' # variable declaration - string
pizza_toppings = ['Pepperoni', 'Sausage', 'Jalepenos', 'Cheese', 'Olives'] # variable declaration - list
person = {'name': 'John', 'location': 'Salt Lake', 'age': 37, 'is_balding': False} # variable declaration - dictionary
fruit = ('blueberry', 'strawberry', 'banana') # variable declaration - tuple
print(type(fruit)) #printing the data type of tuple
print(pizza_toppings[1]) #print the second item in the list "Sausage"
pizza_toppings.append('Mushrooms') # adding Mushrooms to the end of the list
print(person['name']) #print the name field of the person dictionary 
person['name'] = 'George' # updating the name field in the dictionary to George
person['eye_color'] = 'blue' #updating the eye color field to blue
print(fruit[2]) #print the 3rd item in the tuple "banana" 

"""
If statement, testing if num1 is greater than 45. 
Output should print "It's lower"
"""
if num1 > 45: 
    print("It's greater")
else:
    print("It's lower")

"""
If statement, testing if length is less than 5 or greate than 15. 
Output should print "Just right!"
"""

if len(string) < 5:
    print("It's a short word!")
elif len(string) > 15:
    print("It's a long word!")
else:
    print("Just right!")



for x in range(5): 
    print(x)  # print 0-4
for x in range(2,5):
    print(x) # print 2-4
for x in range(2,10,3):
    print(x) #print 2,5,8. Start at 2, stop at 10, incrementing by 3  
x = 0
while(x < 5): # while loop print 0-4, increment by 1
    print(x)
    x += 1

pizza_toppings.pop() # removes last item from list - mushrooms
pizza_toppings.pop(1) #removes second item from list - sausage


print(person)
person.pop('eye_color') # removes eye color from the dictionary
print(person)

for topping in pizza_toppings: # For loop iterating thru list from start to finish
    if topping == 'Pepperoni': 
        continue #fall out of for loop if pepperoni, to next item in list
    print('After 1st if statement') #printing for every record, except pepperoni
    if topping == 'Olives':  
        break # if olives, then end the for loop

def print_hello_ten_times(): #defining a function
    for num in range(10):
        print('Hello') #print hello 10 times (0-9) 

print_hello_ten_times() #calling the function

def print_hello_x_times(x): #defining the function, with parameter x
    for num in range(x): #for loop to run x times (0-3)
        print('Hello')

print_hello_x_times(4) #calling the function, with an argument of 4

def print_hello_x_or_ten_times(x = 10): #defining a function with a parameter/arguement
    for num in range(x):
        print('Hello')

print_hello_x_or_ten_times() # call function, print Hello 10 times

print_hello_x_or_ten_times(4) # call function with arguement, print Hello 4 times 


"""
Bonus section
"""
num3 = 72
print(num3) #error - no num3. to correct moved num3 above

#fruit[0] = 'cranberry' #error - fruit is a tuple and does not allow update

#print(person['favorite_team']) #error - favorite_team is not a field in the dictionary

#print(pizza_toppings[7]) #error - the list doesn't have this many entries

print(boolean) #error - incorrect identation

#fruit.append('raspberry') #error - tuple cannot be updated

#fruit.pop(1) #error - tuple cannot be updated