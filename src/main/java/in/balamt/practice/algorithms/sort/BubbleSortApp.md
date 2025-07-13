# Data Structure - Bubble Sort Algorithm
[Back to home](../../../../../../../../README.md)

----------------------------------------------------

# Bubble Sort Algorithm

Bubble sort is a simple way to sort a list of numbers. It works by repeatedly comparing pairs of numbers and swapping them if they are in the wrong order. This process continues until the list is sorted.

## Why Sorting?

Sorting helps organize data so it can be searched or processed more easily.

## How Bubble Sort Works (Step-by-Step)

1. Start at the beginning of the list.
2. Compare each pair of adjacent numbers.
3. If the first number is bigger, swap them.
4. Repeat until no swaps are needed.

### Example

Original: 4 | 2 | 7 | 1

First pass: 2 | 4 | 1 | 7  
Second pass: 2 | 1 | 4 | 7  
Third pass: 1 | 2 | 4 | 7

## Pseudocode

repeat swapped = false 
for i = 0 to n-2 
if list[i] > list[i+1] 
swap(list[i], list[i+1]) 
swapped = true until not swapped

## Complexity

- Time: O(n^2) (slow for large lists)
- Space: O(1) (no extra memory needed)

## Pros and Cons

**Pros:**
- Easy to understand
- Simple to implement

**Cons:**
- Slow for large lists
- Not used in real-world applications

## Java Example

See `BubbleSortApp.java` for a complete code example.

Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based, in which each pair of adjacent elements is compared, and the elements are swapped if they are not in order. This algorithm is not suitable for large data sets as its average and worst-case complexity are Ο(n^2), where n is the number of items.

```Performance degrades as the number of items grows.```

#### Bubble Sorting Algorithm:
1. Compare x and x + 1 values.
2. If x + 1 is smaller, swap:
    1. Swap x + 1 to a temporary variable.
    2. Swap x to x + 1 index.
    3. Assign the temporary variable to x.
    4. Mark that a swap has happened using a boolean flag.
3. Check if the swap flag is true:
    1. If not swapped, break from the loop.
    2. If swapped, continue the loop.

### Let us see in detail with an example
The objective is to compare the values, find the smallest, and swap it to the left if the right value is smaller than the left.

#### How Bubble Sort Works?
We take an unsorted array for our example. Bubble sort takes Ο(n^2) time, so we're keeping it short and precise.

| 14  | 33  | 27  | 35  | 10  |
|-----|-----|-----|-----|-----|

Bubble sort starts with the very first two elements, comparing them to check which one is greater.

| ```14``` | ```33``` | 27  | 35  | 10  |
|----------|----------|-----|-----|-----|

In this case, the value 33 is greater than 14, so it is already in the sorted location. Next, we compare 33 with 27.

| 14  | ```33``` | ```27``` | 35  | 10  |
|-----|----------|----------|-----|-----|

We find that 27 is smaller than 33, and these two values must be swapped.

| 14  | ```33``` | ```27``` | 35  | 10  |
|-----|----------|----------|-----|-----|

The new array should look like this:

| 14  | 27  | 33  | 35  | 10  |
|-----|-----|-----|-----|-----|

Next, we compare 33 and 35. We find that both are already in sorted positions.

| 14  | 27  | ```33``` | ```35``` | 10  |
|-----|-----|----------|----------|-----|

Then we move to the next two values, 35 and 10.

| 14  | 27  | 33  | ```35``` | ```10``` |
|-----|-----|-----|----------|----------|

We know that 10 is smaller than 35. Hence, they are not sorted.

| 14  | 27  | 33  | ```35``` | ```10``` |
|-----|-----|-----|----------|----------|

We swap these values. We find that we have reached the end of the array. After one iteration, the array should look like this:

| 14  | 27  | 33  | 10  | ```35``` |
|-----|-----|-----|-----|----------|

To be precise, we are now showing how an array should look after each iteration. After the second iteration, it should look like this:

| 14  | 27  | 10  | ```33``` | ```35``` |
|-----|-----|-----|----------|----------|

Notice that after each iteration, at least one value moves to the end.

| 14  | 10  | ```27``` | ```33``` | ```35``` |
|-----|-----|----------|----------|----------|

And when there's no swap required, bubble sort learns that the array is completely sorted.

| ```10``` | ```14``` | ```27``` | ```33``` | ```35``` |
|----------|----------|----------|----------|----------|