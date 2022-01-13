p="Mir labib hossain is my name and and i dont know the meaning of labib".split(" ")
l = len(p)
str = "labib"
count = 0
for i in range(l):
    if str == p[i]:
        count+=1
        print(f"Appeared no : {count} of '{str}' at index({i}) ")
print(f"The word '{str}' appeared total {count} ",end="")
if count>1:
    print("times")
else:
    print("time")
