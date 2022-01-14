target = open("48_1_text.txt","r")
lines = target.read().splitlines()
for i in lines:
    if "Python" not in i or "Bash" not in i:
        print(i)
    