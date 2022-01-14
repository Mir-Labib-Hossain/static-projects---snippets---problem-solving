import sys,re;

def bubbleSort(arr): 
    print("Sorted Data based on price : ")
    n=len(arr)
    for i in range(n-1): 
        for j in range(n-1-i):   
            price1 = int(arr[j][2].split(" ")[1]) 
            price2 = int(arr[j+1][2].split(" ")[1]) 
            if price1>price2:
                arr[j],arr[j+1]=arr[j+1],arr[j]
    print("ID    Name   Price")
    for i in arr:
        print("   ".join(i)) 

arg=sys.argv[1:] 
if len(arg) != 2:
    print("Invalid argument inputed")
    exit()
try:
    is2ndArgIsInt = int(arg[1])
except:
    print("Invalid price inputed")
    exit()
itemFound=False
needToProceed=True 

fileName="products.txt" 
target=open(fileName,"r")

oldData=target.read().splitlines() 
totalData=len(oldData)

newData=[]

for i in range(1,totalData):
    row=re.split(r"\s{2,}",oldData[i])
    if row[1] == arg[0]: 
        if row[2] == "Tk. "+arg[1]: 
            needToProceed=False 
            break 
        row[2] = "Tk. "+arg[1] 
        itemFound=True 
    newData.append([row[0],row[1],row[2]]) 
if needToProceed:
    target=open(fileName,"w") 
    if itemFound:
        target.write("ID   Name   Price\n") 
        for i in newData:
            target.write("   ".join(i)+"\n")
    else: 
        if totalData<10: 
            newProductId="0"+str(totalData)
        else:
            newProductId=str(totalData)
        target.write("{}\n{}.   {}   Tk. {}".format("\n".join(oldData),newProductId,arg[0],arg[1]))
        newData.append([newProductId+".",arg[0],"Tk. "+arg[1]])
    bubbleSort(newData)
else:
    arr=[]
    for i in oldData[1:]:
        arr.append(re.split(r"\s{2,}",i))
    bubbleSort(arr)


"""

import sys,re;

def bubbleSort(arr): #used bubble sort for sorting my product list based on price
    #here variable 'arr' comes like list inside list,
    # arr = [['01.', 'Pen', 'Tk. 100'], ['02.', 'Pencil', 'Tk. 10'],...]
    print("Sorted Data based on price : ")
    n=len(arr)
    for i in range(n-1): 
        for j in range(n-1-i):

            #here i tried to store only product price from each 'arr' index
            #For explanation : where :
            # arr[j] = ['01.', 'Pen', 'Tk. 100']
            # arr[j][2] = 'Tk. 100'
            # arr[j][2].split(" ") = ["Tk.", "100"]
            # arr[j][2].split(" ")[1] = "100"
            # int(arr[j][2].split(" ")[1]) = 100, converted to string to integer to compare price for sorting
            price1 = int(arr[j][2].split(" ")[1]) #price of array index 'j'
            price2 = int(arr[j+1][2].split(" ")[1]) #price of array index 'j+1'

            if price1>price2:
                arr[j],arr[j+1]=arr[j+1],arr[j] #swapping the whole index value if the condition is true

    print("ID    Name   Price") # printing the title as our list 'arr' dosn't content it
    for i in arr: #printing sorted list
        print("   ".join(i)) #used join to conver each element from this : ['01.', 'Pen', 'Tk. 100'] to that : "01.   Pen   Tk. 100"

#Start from here ========>
arg=sys.argv[1:] # storing the argument list without index 0, which is file name
itemFound=False # assuming that the item name we are entering as argument is not found yet
needToProceed=True # so we assume that we need to proceed opur operaion to insert new product / update the new price

fileName="products.text" # file name where product info is stored
target=open(fileName,"r")

oldData=target.read().splitlines() # reading the file based on each line, where index[0] = 1st line
totalData=len(oldData) # no. of line we fount inside the file

newData=[] #initializing an new list, in case we need to update a products price

for i in range(1,totalData): #staring loop from index 1 because i dont want to run my operation on the index with value ["ID   Name   Price"]
    
    #here i can see that inside my text file, the gap between each data is not fixed,
    #Ex: oldData[4] = "04.    Color Pencil  Tk. 300"
    #Here i cant use .split(" "), because if i do that the product name "Color Pencil" & the price "Tk. 300" will be splitted also, which will cause my programe ERROR
    #So i need to split based on : 2 or more spaces, so i used regEx : r"\s{2,}
    row=re.split(r"\s{2,}",oldData[i])

    if row[1] == arg[0]: # here row[1] is each product name and arg[0] is inputed product name, if they match then we 
        if row[2] == "Tk. "+arg[1]: # we check row[1] which is each product price and arg[1] which is inputed product price
            needToProceed=False #if they match then we can see that user inputed existing product name with same price, so we no need to proceed out operation further
            break #so we break the loop
        row[2] = "Tk. "+arg[1] # else we replace the new value
        itemFound=True # and setting that a item is found with updated new price
    newData.append([row[0],row[1],row[2]]) #mean while we kept appending our old data as well as updated data in a list called 'newData'
if needToProceed:
    target=open(fileName,"w") 
    if itemFound: # if item is found with new price tage then :
        target.write("ID   Name   Price\n") #writing the headet in text file first
        for i in newData:
            target.write("   ".join(i)+"\n")
    else: # here item is not found so we need to insert a new item :
        if totalData<10: #checking if the id is single digit or multi digit
            newProductId="0"+str(totalData) # if single digit then we add a zero before ex: id = "0"+9
        else:
            newProductId=str(totalData) #no need to update new product id

        #Now here oldData is same all we need to do is just simply concate a new data with oldData,
        # so we 1st write oldData, new line '\n\, then new producy id, inputed product name , inputed price in same line
        target.write("{}\n{}.   {}   Tk. {}".format("\n".join(oldData),newProductId,arg[0],arg[1]))
        #and keept everything in newData list for sorting
        newData.append([newProductId+".",arg[0],"Tk. "+arg[1]])
    #then we send the list to sort
    bubbleSort(newData)
else:
    # if inputed product name exiss and price is same 
    #then we send oldData to sort, but we format the the data before sending into sort function (text file will remain same, it wont change/format)
    arr=[]
    for i in oldData[1:]:
        arr.append(re.split(r"\s{2,}",i))
    bubbleSort(arr)


"""