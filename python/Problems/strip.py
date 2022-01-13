name="   Mir LABIB Hossain   "
print("String before strip : {}".format(name))
name=name.strip()
print("String after strip : {}".format(name))

# chara="_"
# print("String after strip('_') : {}".format(name).strip(chara))

print("String before strip : {}".format(name.capitalize()))


name=name.split(" ")
for i in name:
    name+=i.capitalize()

print("{}".format(name))
