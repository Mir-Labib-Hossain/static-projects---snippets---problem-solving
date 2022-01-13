"""
Write a python script to take any number of 10 digits as a command-line argument and find the
addition of all even digits and the multiplication of all odd digits.
For example:
Input: 8775258553
Output: 
Addition : 8 + 2 =10
Multiplication : 7 * 5 * 3 =105
"""

import sys
num = sys.argv[1]
try:
    x = int(num)
except:
    print("Enter 10 integer number")
    quit()
if len(num) != 10:
    print("Enter 10 integer number")
else:
    num = "".join(dict.fromkeys(num))
    even = ""
    odd = ""
    for i in num:
        if int(i)%2==0:
            even+=i
        else:
            odd+=i
    sum=0
    mul=1
    result=""
    result+="Addition :"
    for e in even:
        result+=" {} ".format(e)
        if even[len(even)-1] == e:
            result+="="
        else:
            result+="+"
        sum+=int(e)
    result+=" "+str(sum)
    print(result)
    result=""
    result+="Multiplication :"
    for o in odd:
        result+=" {} ".format(o)
        mul*=int(o)
        if odd[len(odd)-1]==o:
            result+="="
        else:
            result+="+"
    result+=" "+str(mul)
    print(result)


"""
Input :  
python3 L6_7_arg.py 8775258553

Output:
Addition : 8 + 2 = 10
Multiplication : 7 + 5 + 3 = 105
"""