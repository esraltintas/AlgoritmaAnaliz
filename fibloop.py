import datetime
def fib(x):
    a = 0
    b = 1
    for i in range(0, x):
	temp = a
	a = b
	b = temp + b
    return a
global b
b=[10,20,30,40,50,60,70]
c = []
d = []

start_time = datetime.datetime.now()
for i in range(0,7):
        c.append(fib(b[i]))
        end_time = datetime.datetime.now()
        time = end_time - start_time
        militime = time.microseconds
        d.append(militime)
print c
print d
