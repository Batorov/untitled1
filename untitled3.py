import math
a = 8
b = 16
 
while a != 0 and b != 0:
    if a > b:
        a = a % b
    else:
        b = b % a
    s = a + b
 
print(s)