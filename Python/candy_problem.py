# Solving Another Candies
# https://open.kattis.com/problems/anothercandies

def add(nums):
    sum = 0
    for x in nums:
        sum += x
    return sum 

test_cases = int(input())

# TODO needs fixing
for _ in range(test_cases):
    children_count = int(input())
    candy_count = []
    for _ in range(children_count):
        candy_amount = int(input())
        candy_count.append(candy_amount)
    if sum(candy_count) % children_count == 0:
        print("YES")
    else:
        print("NO") 