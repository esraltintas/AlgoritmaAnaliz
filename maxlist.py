import random
import timeit
x = input("Enter a number: ")

# random lists from [0-99] interval
list = [random.randint(0,100) for r in xrange(x)] # v1
print list
print "Max value element : ", max(list)
