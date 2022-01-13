arr = input("Enter your array using 'Space' : ").split(" ")
min = max = int(arr[0])
for i in arr:
  i=int(i)
  if i>max:
    max=i
  else:
    min = i
print("Min = {}\nMax = {}".format(min,max))
