def calculate(num):
  if num:
    # Recursive function call
    return num + calculate(num-1)
  else:
    return 0

number = int(input("Enter number: "))
res = calculate(number)

print(res)