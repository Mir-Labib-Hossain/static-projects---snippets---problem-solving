# cmd :
# python3 argFileProduct.py text.txt

import sys
filename = sys.argv[1]

print("Opening {}...".format(filename))
target = open(filename, 'w')

print("============================\n")
try:
    leng = int(input("How many products do you want to insert : "))
    print("Enter : 'product name' 'taka'")
    for i in range(leng):
        pro=input("product {}: ".format(i+1))
        target.write(pro)
        target.write("\n")

    target = open(filename, 'r')
    lines = target.read().splitlines()
    print("============================\n")
    print("List of product which is 100 taka : ")
    print("Name\tPrice")
    for i in lines:
        prod=i.split(" ")
        try:
            if int(prod[1]) == 100:
                print("{}\t{}".format(prod[0],prod[1]))
        except:
            print
    print("============================\n")
    print("And finally, we close it.")
except:
    print("Must enter integer value !")
target.close()