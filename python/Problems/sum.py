inp=input("Enter input : ").split("+")
sum=0
for i in inp:
    try:
        sum+=int(i)
    except:
        print("Invalid input, try again !\nInput demo : 23+67+5")
        exit()
print("Summation = {}".format(sum))
