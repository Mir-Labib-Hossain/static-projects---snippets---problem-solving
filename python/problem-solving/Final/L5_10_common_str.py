"""
Write a python script to assign two string values of multiple words. Find out and print which
words are common in both strings.
"""

str1 = input("String 1 : ").split(" ")
str2 = input("String 2 : ").split(" ")
for i in str1:
    if i in str2:
        print(i,", ",end=" ")