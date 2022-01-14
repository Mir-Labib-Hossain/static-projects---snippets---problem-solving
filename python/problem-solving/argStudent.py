#python3 argStudent.py --name "mir labib hossain" --cgpa 4.00 -b 49

import sys,getopt

try:
    opts, args = getopt.getopt(sys.argv[1:], "n:b:c:",["name=","batch=","cgpa="])
    for opt, arg in opts:
        if opt in ["-n","--name"]:
            print("Name = ",arg)
        elif opt in ["-b","--batch"]:
            print("Batch = ",arg)
        elif opt in ["-c","--cgpa"]:
            print("CGPA = ",arg)
except:
    print("Wrong argument inserted !")





















# import sys,getopt

# opts, args = getopt.getopt(sys.argv[1:],"n:b:c:")

# for opt,arg in opts:
#     if(opt in ["-n"]):
#         print("Name : {}".format(arg))
#     elif(opt in ["-b"]):
#         print("Batch {}".format(arg))
#     elif(opt in ["-c"]):
#         print("CGPA : {}".format(arg))

