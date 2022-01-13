"""
Write a python script to declare a list of 5 numbers with duplicates and print the list after
removing the duplicate numbers.
"""
lst = [1, 2, 1, 5, 5]
afterRemovingDublicate = list(set(lst))
for i in afterRemovingDublicate:
    print(i," ",end="")

"""
Output:
1  2  5  
"""
