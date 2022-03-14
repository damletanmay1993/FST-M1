def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))
 
n = int(input("How many Fibonnaci numbers to generate? "))

print("Fibonacci Sequence: ")

for i in range(1,n):
    print(fibonacci(i))