import random
import timeit
x = input("Enter a number: ")

# random lists from [0-99] interval
list = [random.randint(0,100) for r in xrange(x)] # v1
print list

list.sort()
y = input("Kacinci elemani istersiniz?")

print y, ".eleman =  ", list[y-1]
