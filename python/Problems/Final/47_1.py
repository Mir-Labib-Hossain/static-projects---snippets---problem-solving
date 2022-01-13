target = open("48_1_text.txt","r")
lines = target.read().split("\n")
for i in lines:
    if "Python" in i and "Bash" in i:
        print(i)