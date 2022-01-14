def checkCompany(num):
    if num == "6":
        return "Airtel"
    elif num == "8":
        return "Robi"
    else:
        return "Unknown"

target = open("48_4_text.text","r")
numbers = target.read().split("\n")
for i in numbers:
    i = i.split("-")
    print(checkCompany(i[1][1]))
