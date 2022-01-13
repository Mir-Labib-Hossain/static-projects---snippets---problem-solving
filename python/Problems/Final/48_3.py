list = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
k=0
for i in range(1, 5):
    for j in range(i):
        print(list[k],end=" ")
        k+=1
    print("")