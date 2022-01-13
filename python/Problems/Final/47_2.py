spc = "%$#&"
pas="this$s"
if len(pas) < 6:
    print("Must be minimum 6 character long")
elif any(char in spc for char in pas)==0:
    print(" Must contains a special character [%, $, #, &]")
else:
    print("Valid")