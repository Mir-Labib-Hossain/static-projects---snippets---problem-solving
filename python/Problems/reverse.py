# import re
# str=re.split(r"[,\s.]+","hi, mir labib hossain. i m asd")
# str="hi, mir labib hossain. i m asd".replace(". "," ").replace(", "," ")

str="hi, mir labib hossain. i m asd".split(" ")
str = str
rev=""
for i in str:
    for j in range(len(i),0,-1):
        rev+=i[j-1]
    rev+=" "
print("Reverse text:")
print(rev.strip())