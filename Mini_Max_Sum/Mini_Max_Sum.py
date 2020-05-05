import math
import os
import random
import re
import sys

# Complete the miniMaxSum function below.
def miniMaxSum(arr):
    minimum = arr[0]
    maximum = arr[0]
    for i in range(1, len(arr)):
        if arr[i]<minimum:
            minimum = arr[i]
        if arr[i] > maximum:
            maximum = arr[i]
    sumMin = 0
    sumMax = 0
    for i in range(len(arr)):
        if arr[i] is not maximum:
            sumMin+=arr[i]
        else:
            maximum = None
        if arr[i] is not minimum:
            sumMax+=arr[i]
        else:
            minimum = None
    print(sumMin,sumMax)

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)