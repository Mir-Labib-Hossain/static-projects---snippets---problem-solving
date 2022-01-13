def checkCountry(code):
    if code == "+880":
        return "Bangladesh"
    elif code == "+91":
        return "India"
    elif code == "+92":
        return "Pakistan"
    else:
        return "Unknown"
target = open("47_4_text","r")
numbers = target.read().split("\n")
for i in numbers:
    i = i.split("-")
    print(checkCountry(i[0]))
