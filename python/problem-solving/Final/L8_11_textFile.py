"""
Write a python script to search a particular word in a text file and display how many times that
the word appeared in the file and the location of the word.
"""

str="labib"
target=open("text.txt","r")
data = target.read().split(" ")
length = len(data)
apearence = 0
for i in range(length):
    if data[i] == str:
        apearence+=1
        print("Location of Appearence no {} is : {}".format(apearence,i))
print("The word '{}' total appeared {} times".format(str,apearence))





"""
text.txt:
Hi i am labib , labib is 21 year old and labib is a developer

Output:
Location of Appearence no 1 is : 3
Location of Appearence no 2 is : 5
Location of Appearence no 3 is : 11
The word 'labib' total appeared 3 times
"""
