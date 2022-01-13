import string

people = {
    1: {
       "name":"Mir Fayek Hossain",
        "email":"fayek@gmail.com",
        "phone":"187"
        },
    2: {
        "name":"Mir Labib Hossain",
        "email":"labib@gmail.com",
        "phone":"167"
        },
    3: {
        "name":"Shihab Munna",
        "email":"M@gmail.com",
        "phone":"1a67"
        },
    4: {
        "name":"Tanbir 2 hassan",
        "email":"labib@gmail.com",
        "phone":"167"
        },
    5: {
        "name":"Shahadat hossain",
        "email":"1234",
        "phone":"167"
        }
    }
for i in range (1,6):
    error = False
    for character in people[i]['name']:  
        if character not in (string.ascii_letters + string.whitespace):
            error = True
    for character in people[i]['email']:  
        if character not in (string.ascii_lowercase + string.punctuation):
            error = True 
    for character in people[i]['phone']:
        if character not in (string.digits + string.punctuation):
            error = True
    if error == False :
        print("Name: {}, Email: {}, Phone: {}".format(people[i]['name'],people[i]['email'],people[i]['phone']))
