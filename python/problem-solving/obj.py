
obj={}
count1=0
count10=0
name1=[]
name10=[]
print("Enter 5 name of customer and theit balance ammount")
for i in range(0,5):
    name=input("name : ")
    bal=input("balance : ")
    obj[bal]=[name]
    if int(bal)<100000:
        name1.insert(count1,name)
        count1=+1
    if int(bal)>1000000:
        name10.insert(count10,name)
        count10=+1
        
print("Customer with less then 1Lac : {}, their name :".format(count1))
for name in name1:
    print(name)
print("Customer with more then 10Lac : {}, their name :".format(count10))
for name in name10:
    print(name)
for i in obj:
    print("{}\t{}".format(obj[i],i))
tempName=""
tempBal=""
for i in obj:
    for j in obj:
        if int(i) > int(j):
            tempName=obj[j]
            tempBal=j
            obj[j]=obj[i]
            j=i
            obj[i]=tempName
            i=tempBal
            # print(tempName,tempBal)
print("\n")
for i in obj:
    print("{}\t{}".format(obj[i],i))