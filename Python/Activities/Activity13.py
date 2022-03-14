def calculate_sum(numbers):
	sum = 0
	for number in numbers:
		sum += number
	return sum

numList = [10, 40, 60, 90]

lst = []

n = int(input("Enter number of elements in list: "))

for i in range(0, n):
	ele = int(input())

	lst.append(ele)

result = calculate_sum(lst)

print("The sum of all the elements is: " + str(result))