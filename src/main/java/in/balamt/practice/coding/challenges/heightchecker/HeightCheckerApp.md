# Height Checker - Code Challenge

A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].



**_Example 1:_**

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
_**Example 2:**_

Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
**_Example 3:_**

Input: heights = [1,2,3,4,5]
Output: 0
Explanation:
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.


**Constraints:**

1 <= heights.length <= 100
1 <= heights[i] <= 100

```
Hint: Build the correct order of heights by sorting another array, then compare the two array
```

---

## Height Checker Logic

1. **Clone the heights array**
    - Create a copy of the original array to avoid modifying it.

2. **Sort the cloned array**
    - Sorting gives the expected order of students by height.

3. **Compare both arrays**
    - Loop through each index.
    - If the value at an index in the original array does not match the sorted array, increment a counter.

4. **Return the count**
    - The counter represents the number of students not in the correct order.

### Example

Input: heights = [1, 1, 4, 2, 1, 3]

- Sorted: expected = [1, 1, 1, 2, 3, 4]
- Compare each index:
    - Indices 2, 4, and 5 differ.
- Output: 3


### Time Complexity:
- Cloning the array: \(O(n)\)
- Sorting the array: \(O(n \log n)\)
- Comparing arrays: \(O(n)\)  
  **Total:** \(O(n \log n)\)

### Space Complexity:
- Extra array for sorting: \(O(n)\)  
  **Total:** \(O(n)\)