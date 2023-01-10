# #1 - prediction - print 5
# def number_of_food_groups():
#     return 5
# print(number_of_food_groups())


# #2 - prediction - error undefined function
# def number_of_military_branches():
#     return 5
# print(number_of_days_in_a_week_silicon_or_triangle_sides() + number_of_military_branches())

# 1. Countdown - Create a function that accepts a number as an input. 
#    Return a new list that counts down by one, from the number (as the 0th element) 
#    down to 0 (as the last element).
#    Example: countdown(5) should return [5,4,3,2,1,0]

# def countdown(num):
#     for i in range (num,0,-1):
#         print(i)

# countdown(5)

# 2. Print and Return - Create a function that will receive a list with two numbers.
#    Print the first value and return the second.
#    Example: print_and_return([1,2]) should print 1 and return 2

# def print_and_return(pnum,rnum):
#     print(pnum)
#     return(rnum)

# print(print_and_return(6,7))



# 3. First Plus Length - Create a function that accepts a list and returns the sum 
#    of the first value in the list plus the list's length.
#    Example: first_plus_length([1,2,3,4,5]) should return 6 (first value: 1 + length: 5)

# def get_sum(num):
#     print(num[0] + len(num))

# list1 = [1,2,3,5,6,7,8,9]

# get_sum(list1)



# 4. Values Greater than Second - Write a function that accepts a list and creates 
#    a new list containing only the values from the original list that are greater 
#    than its 2nd value. Print how many values this is and then return the new list. 
#    If the list has less than 2 elements, have the function return False
#    Example: values_greater_than_second([5,2,3,2,1,4]) should print 3 and return [5,3,4]
#    Example: values_greater_than_second([3]) should return False

# def chek_num(num):
#     counter = 0
#     newlist = []
#     for i in range(0,len(num)):
#         if num[i] > num[1]:
#             newlist.append(num[i])
#             counter=counter +1
#     print(counter)
#     return newlist
    
# list1 = [5,2,3,2,1,4]

# print(chek_num(list1))




# 5. This Length, That Value - Write a function that accepts two integers as 
#    parameters: size and value. The function should create and return a list 
#    whose length is equal to the given size, and whose values are all the given value.
#    Example: length_and_value(4,7) should return [7,7,7,7]
#    Example: length_and_value(6,2) should return [2,2,2,2,2,2]

def chek_num(num):
    newlist = []
    for i in range(0,num[0]):
        newlist.append(num[1])
    return newlist
    
list1 = [5,9]

print(chek_num(list1))






