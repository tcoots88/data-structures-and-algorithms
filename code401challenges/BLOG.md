 # Insertion Sort

## Problem Domain

Insert value into array and sort into ascending order.  


## Pseudocode

    InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

## Examples

[8,4,23,42,16,15] - > [4,8,15,16,23,42]


Reverse-sorted: [20,18,12,8,5,-2] - > [-2,5,8,12,18,20]

Few uniques: [5,12,7,5,5,7] - > [5,5,5,7,7,12]

Nearly-sorted: [2,3,5,7,13,11] - > [2,3,5,7,11,13]


 # MergeSort

## Problem Domain

Divides input array in two halves, calls itself for the two halves and then merges the two sorted halves


## Pseudocode

    
    ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

    ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

## Examples

https://www.geeksforgeeks.org/merge-sort/










