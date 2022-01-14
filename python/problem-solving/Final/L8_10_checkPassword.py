"""
Write a python script to take input as a password. Check and print “The password is valid”
based on the following criteria, otherwise print “invalid password”. [5]
A. Minimum 8 characters long.
B. Must contain a special character.
C. Minimum one capital letter, small letter, and a number.
"""


import string

pas = input("Enter password : ")
if len(pas) < 8:
    print("Password must be minimum 8 character long")
else:
    if any(char in string.punctuation for char in pas) == 0:
        print("Password must contain a special character")
    elif any(char in string.ascii_lowercase for char in pas) ==0:
        print("Password must contain a special Lowercasecharacter")
    elif any(char in string.ascii_uppercase for char in pas) == 0:
        print("Password must contain a special Uppercase character")
    elif any(char in string.digits for char in pas) == 0:
        print("Password must contain a digit")
    else:
        print("Password is valid")


