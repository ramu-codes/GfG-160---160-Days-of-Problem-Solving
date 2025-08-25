class MoveZeros {
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;  

         
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

     
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        moveZerosToEnd(arr);
 
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


// Explaination and details ---
/* Problem understanding & approach

Why array is used

How arrays work in Java & implementation

Code explanation line by line

Time complexity analysis

Space complexity analysis

General tips on how to calculate complexities

1. Problem Understanding & Approach

We are given an array of integers. Our task is to move all zeros to the end of the array while keeping the relative order of the non-zero elements the same.

Example: [1, 2, 0, 4, 3, 0, 5, 0] → [1, 2, 4, 3, 5, 0, 0, 0]

Constraint: We must not use extra space (like another array).

👉 Approach:

Use an index pointer that keeps track of the next position where a non-zero should be placed.

Traverse the array:

If element ≠ 0 → move it to arr[index] and increment index.

After traversal, fill remaining positions with 0.

This is called the two-pointer technique.

2. Why Array is Used?

An array is a contiguous block of memory where all elements are of the same type (in Java → all int here).

Direct indexing makes element access O(1).

In this problem, since we need in-place changes (without extra space), array is ideal.

3. Arrays in Java – Basics
Declaration:
int[] arr;     // just a reference, memory not allocated yet

Initialization:
arr = new int[5];  // array of size 5 with default values (0)

Declaration + Initialization:
int[] arr = {1, 2, 3, 4}; // directly assign values


👉 Arrays in Java are objects, not primitives. So arr is actually a reference to the memory block in the heap.

4. Code Explanation (line by line)
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;   // length property gives size of array
        int index = 0;        // pointer for placing non-zero elements
        
        // Step 1: Move non-zero elements to front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {  
                arr[index] = arr[i]; // put non-zero at 'index'
                index++;             // move index forward
            } 
        }

        // Step 2: Fill the remaining array with 0s
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }
}

5. Time Complexity

Step 1 (for loop): Runs n times → O(n)

Step 2 (while loop): Runs at most n times (in practice, fewer, because some positions already filled) → O(n)

So Total Time Complexity = O(n) + O(n) = O(n)

👉 Explanation: Every element is processed at most twice, so it’s linear time.

6. Space Complexity

We are not using extra arrays or data structures.

Only a few variables (n, index, i) → constant memory.

So Space Complexity = O(1) (constant).

7. How to Calculate Complexities (General Tips)

Time complexity:

Look at number of iterations of loops.

Nested loops → multiply counts.

Sequential loops → add counts.

Dominant term decides the result (drop constants).

Space complexity:

Count extra memory used (arrays, lists, maps, recursion stack).

Ignore input size itself unless explicitly asked.

Final Notes for Interview

Array choice: We used array because random access and in-place updates are required.

Method: void pushZerosToEnd(int[] arr) → void means it doesn’t return anything, it directly modifies the array.

Implementation style:

Use one loop for shifting.

Use one loop for filling zeros.

Optimisation: This is already optimal with O(n) time, O(1) space. */

