"""
Write a python script to declare a list of 10 numbers and print the list after removing all odd
numbers.
"""
lst = [10, 20, 3, 4 ,2 ,1 ,4, 1, 4, 9]
for i in lst:
    if i%2!=0:
        # lst.remove(i)
        continue
    print(i,end=" ")
# print(lst)


"""
Output:
with continue 
10 20 4 2 4 4
with remove
[10, 20, 4, 2, 4, 4]
"""
