# Solving Greetings! problem
# https://open.kattis.com/problems/greetings2

s = input()

e_count = s.count('e')
first_index = s.index('e')
last_index = s.rindex('e') + 1

print(s[:first_index] + "e" * e_count * 2 + s[last_index:])