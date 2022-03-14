lst = []
sum =0

n = int(input("Enter number of elements : "))

for i in range(0, n):
	ele = int(input())

	lst.append(ele)
	
for number in lst:
    sum += int(number)
print("Sum of integers in Array is: ", sum)