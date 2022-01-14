inp=input("Enter input : ").split("+")
sum=0
if len(inp) == 4:
    for i in inp:
        try:
            sum+=int(i)
        except:
            print("Invalid input, try again !\nInput sample: '1+2+3+4'")
            exit()
    print("Summation = {}".format(sum))
else:
    print("\nMust enter 4 intiger !\nInput sample: '1+2+3+4'")
