thisdict =	{
  "apple": 10,
  "mango": 50,
  "banana": 25,
  "orange": 34
}

check = input("Which fruit would you like to check? ")

if (check in thisdict):
    print(check, " is avaiable")
else:
    print(check, " is not avaiable")
