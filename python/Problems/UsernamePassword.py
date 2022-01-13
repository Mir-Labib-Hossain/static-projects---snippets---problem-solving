spc="!@#$%^&*()_+"
ch="abcdefghijklmnopqrstuvwxyz"
num="0123456789"

name="labiba"

if len(name) == 6:
    if any(char in num for char in name):
        print("Name can't contain number")
    elif any(char in spc for char in name):
        print("Name cant' contain special characters")
    else:
        pas="11111a1$"
        if len(pas) == 8:
            if any(char in spc for char in pas)==0:
                print("Password must contain atleast one special character [!@#$%^&*()-+?_=,<>/]")
            elif any(char in ch for char in pas)==0:
                print("Password must contain atleast one characters [a-z] / [A-Z]")
            elif any(char in num for char in pas)==0:
                print("Password must contain atleast one integer [0-9]")
            else:
                print("Logged-in succesful")
        else:
            print("Password lenght must be 8")
else:
    print("Username must contains 6 character ")