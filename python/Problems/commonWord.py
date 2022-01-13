str1=input("Enter 1st string : ").split(" ")
str2=input("Enter 2nd string : ").split(" ")
count=0
for i in str1:
    if i in str2:
        print("'{}' is common".format(i))
        count=+1
if count == 0:
    print("No common word found")