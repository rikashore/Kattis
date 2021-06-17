# Solving the Yin and Yang Stones problem
# https://open.kattis.com/problems/yinyangstones

s = input()

s = s.upper()

w_count = s.count('W')
b_count = s.count('B')

if w_count == b_count:
    print(1)
else:
    print(0)