import datetime
def fib(x):
    if x==0 or x==1: return 1
    else: return fib(x-1)+fib(x-2)
global b
b=[10,20,30,40,50,60,70]
c = []
d = []

start_time = datetime.datetime.now()
for i in range(0,4):
	c.append(fib(b[i]))
	end_time = datetime.datetime.now()
	time = end_time - start_time
        militime = time.microseconds
	d.append(militime)
print c
print d	
        
