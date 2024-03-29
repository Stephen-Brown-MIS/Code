# Section 1. Update Values in Dictionaries and Lists

# x = [ [5,2,3], [10,8,9] ] 
# students = [
#      {'first_name':  'Michael', 'last_name' : 'Jordan'},
#      {'first_name' : 'John', 'last_name' : 'Rosales'}
# ]
# sports_directory = {
#     'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
#     'soccer' : ['Messi', 'Ronaldo', 'Rooney']
# }
# z = [ {'x': 10, 'y': 20} ]


# 1. Change the value 10 in x to 15. Once you're done, x should now be [ [5,2,3], [15,8,9] ].

# x[1][0] = 15
# print(x)

# 2. Change the last_name of the first student from 'Jordan' to 'Bryant'

# students[0]["last_name"] = "Bryant"
# print(students)


# 3. In the sports_directory, change 'Messi' to 'Andres'

# sports_directory['soccer'][0] = "Andres"
# print(sports_directory)

# 4. Change the value 20 in z to 30

# z[0]["y"] = 30
# print(z)


# Section 2 Iterate Through a List of Dictionaries

# Create a function iterateDictionary(some_list) that, given a 
# list of dictionaries, the function loops through each dictionary in the list 
# and prints each key and the associated value. For example, given the following list:

students = [
         {'first_name':  'Michael', 'last_name' : 'Jordan'},
         {'first_name' : 'John', 'last_name' : 'Rosales'},
         {'first_name' : 'Mark', 'last_name' : 'Guillen'},
         {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
# def iterateDictionary(arg1):
#     for i in range (0,len(arg1)):
#             print(arg1[i])

# iterateDictionary(students)


# Section 3. Get Values From a List of Dictionaries
#    Create a function iterateDictionary2(key_name, some_list) that, given a 
#    list of dictionaries and a key name, the function prints the value stored 
#    in that key for each dictionary. 

#    For example, iterateDictionary2('first_name', students) should output:

# def iterateDictionary2(arg1,arg2):
#     for i in range (0,len(arg1)):
#             print(arg1[i][arg2])

# # iterateDictionary2(students,"first_name")
# iterateDictionary2(students,"last_name")

# Section 4. Iterate Through a Dictionary with List Values

# Create a function printInfo(some_dict) that given a dictionary whose values 
# are all lists, prints the name of each key along with the size of its list, 
# and then prints the associated values within each key's list. For example:

dojo = {
   'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
   'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}

def printInfo(dict1):
    length_location = len(dict1["locations"])
    print(f"{length_location} LOCATIONS")
    for i in range(0,length_location):
        print(dict1["locations"][i])

    print(" ")
    
    num_instructors = len(dict1["instructors"])
    print(f"{num_instructors} INSTRUCTORS")
    for i in range(0,num_instructors):
        print(dict1["instructors"][i])

printInfo(dojo)



