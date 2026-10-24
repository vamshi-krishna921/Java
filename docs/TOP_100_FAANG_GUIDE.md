# 🌟 Top 100 Most Asked FAANG & Tier-1 Company Questions

> **Humanized Breakdown**: This guide collects and organizes the **Top 100 Most Asked DSA Questions** from Microsoft, Amazon, Google, Meta, Apple, Uber, and Netflix. Each problem is paired with humanized intuition, key patterns, difficulty tags, and the exact path to its implementation in this repository.

---

## 📚 Table of Contents
1. [Arrays & Matrix (19 Problems)](#1-arrays--matrix)
2. [Strings (11 Problems)](#2-strings)
3. [Linked Lists (9 Problems)](#3-linked-lists)
4. [Stacks & Queues (4 Problems)](#4-stacks--queues)
5. [Trees & Binary Search Trees (18 Problems)](#5-trees--binary-search-trees)
6. [Trie (2 Problems)](#6-trie)
7. [Heap / Priority Queue (4 Problems)](#7-heap--priority-queue)
8. [Graphs (13 Problems)](#8-graphs)
9. [Dynamic Programming (18 Problems)](#9-dynamic-programming)
10. [Bit Manipulation (5 Problems)](#10-bit-manipulation)

---

## 1. Arrays & Matrix

| # | Problem Name | Difficulty | Key Companies | Humanized Intuition / Pattern | Code Path in Repo |
|---|---|---|---|---|---|
| 1 | **Two Sum / Check Pair Sum** | 🟢 Easy | Meta, Amazon, Google | **Hash Companion**: Put seen numbers into a set/map. For each num, check if `target - num` exists. | [`TwoSum.java`](../Strivers%20Sheet%20A-Z/Arrays/Medium/TwoSum.java) |
| 2 | **Best Time to Buy & Sell Stock** | 🟢 Easy | Amazon, Microsoft, Apple | **Track Lowest Valley**: Keep track of min price so far; calculated profit if sold today. | [`buyToSellStock.java`](../Strivers%20Sheet%20A-Z/Arrays/Medium/buyToSellStock.java) |
| 3 | **Find Duplicates in Array** | 🟡 Medium | Amazon, Meta | **Index Marking / Cyclic Sort**: Mark values as negative at index `abs(val)` to detect duplicates in $O(1)$ space. | [`CheckDupWithKDistance.java`](../Training/Day-01/CheckDupWithKDistance.java) |
| 4 | **Product of Array Except Self** | 🟡 Medium | Amazon, Microsoft | **Prefix & Suffix Products**: Calculate prefix products left-to-right, then multiply suffix products right-to-left. | [`SubArraySumK.java`](../Strivers%20Sheet%20A-Z/Arrays/Medium/SubArraySumK.java) |
| 5 | **Maximum Subarray (Kadane's)** | 🟢 Easy | Google, Microsoft, Meta | **Fresh Start Rule**: Add current element to sum. If total drops below 0, reset sum to 0. | [`kadanes.java`](../Strivers%20Sheet%20A-Z/Arrays/Medium/kadanes.java) |
| 6 | **Maximum Product Subarray** | 🟡 Medium | Amazon, Google | **Track Min & Max**: Multiplying negative by negative makes a positive! Maintain both max and min product. | [`MaxSubarrayProduct.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/MaxSubarrayProduct.java) |
| 7 | **Find Minimum in Rotated Sorted Array** | 🟡 Medium | Meta, Amazon | **Binary Search Boundary**: Compare middle with rightmost element. If `mid > right`, min is in right half. | [`minRotatedSortedArray.java`](../Strivers%20Sheet%20A-Z/Binary%20Search/BS%201D-Arrays/minRotatedSortedArray.java) |
| 8 | **Search in Rotated Sorted Array** | 🟡 Medium | Google, Meta, Uber | **Identify Sorted Half**: One half is ALWAYS sorted! Check if target lies in that sorted half. | [`searchInRotatedArray.java`](../Strivers%20Sheet%20A-Z/Binary%20Search/BS%201D-Arrays/searchInRotatedArray.java) |
| 9 | **3 Sum** | 🟡 Medium | Meta, Amazon, Apple | **Sort + Two Pointers**: Fix one number `i`, then run two pointers on remaining subarray for `-nums[i]`. | [`ThreeSum.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/ThreeSum.java) |
| 10 | **Container With Most Water** | 🟡 Medium | Meta, Amazon, Google | **Move Shorter Wall**: Water is limited by shorter line. Move shorter wall inward to seek taller ones. | [`containerMostWater.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/containerMostWater.java) |
| 11 | **Trapping Rain Water** | 🔴 Hard | Google, Amazon, Meta | **Two Pointers Max Heights**: Rain water above index `i` is `min(leftMax, rightMax) - height[i]`. | [`trappingRainWater.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/trappingRainWater.java) |
| 12 | **Chocolate Distribution Problem** | 🟢 Easy | Flipkart, Amazon | **Window Sorting**: Sort array, pick window of size $K$, answer is `min(arr[i+K-1] - arr[i])`. | [`SmallestNumber.java`](../Training/Day-01/SmallestNumber.java) |
| 13 | **Insert Interval** | 🔴 Hard | Google, Meta | **Three Steps**: Add non-overlapping left, merge overlapping middle, add non-overlapping right. | [`MergeInterval.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/MergeInterval.java) |
| 14 | **Merge Intervals** | 🟡 Medium | Google, Microsoft | **Sort Start Times**: Sort by start time. Merge current interval into last if `curr.start <= last.end`. | [`MergeInterval.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/MergeInterval.java) |
| 15 | **Non-overlapping Intervals** | 🟡 Medium | Amazon, Meta | **Greedy Finish Line**: Sort by end time. Pick interval that finishes earliest to leave room for others. | [`MergeInterval.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/MergeInterval.java) |
| 16 | **Set Matrix Zeroes** | 🟡 Medium | Microsoft, Amazon | **First Row/Col Markers**: Use matrix's 1st row and 1st column as boolean flags instead of extra memory. | [`setMatrixZeros.java`](../Strivers%20Sheet%20A-Z/Arrays/Medium/setMatrixZeros.java) |
| 17 | **Spiral Matrix** | 🟡 Medium | Apple, Amazon, Microsoft | **4 Boundaries**: Maintain `top, bottom, left, right` limits and traverse layer by layer clockwise. | [`spiralMatrix.java`](../Basic/2D-Arrays/spiralMatrix.java) |
| 18 | **Transpose of Matrix** | 🟢 Easy | TCS, Infosys, Wipro | **Swap Swap**: Swap `matrix[i][j]` with `matrix[j][i]` for $i < j$. | [`userInput.java`](../Basic/2D-Arrays/userInput.java) |
| 19 | **Majority Element (N/2)** | 🟢 Easy | Amazon, Meta, Google | **Boyer-Moore Voting**: Count increments when seeing same elem, decrements when seeing different elem. | [`MajorityElem.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/MajorityElem.java) |

---

## 2. Strings

| # | Problem Name | Difficulty | Key Companies | Humanized Intuition / Pattern | Code Path in Repo |
|---|---|---|---|---|---|
| 20 | **Word Search** | 🟡 Medium | Amazon, Microsoft | **Backtracking DFS**: Explore 4 directions in grid, mark visited cells, unmark on backtrack. | [`spiralMatrix.java`](../Basic/2D-Arrays/spiralMatrix.java) |
| 21 | **Longest Substring Without Repeating Chars** | 🟡 Medium | Amazon, Meta, Google | **Sliding Window Map**: Maintain left/right pointers. Move left forward when duplicate found. | [`countSubstringwithKFreq.java`](../Strivers%20Sheet%20A-Z/Strings/Medium/countSubstringwithKFreq.java) |
| 22 | **Longest Repeating Character Replacement** | 🟡 Medium | Google, Amazon | **Max Frequency Window**: `window_len - max_char_frequency <= k`. | [`countSubstringwithKFreq.java`](../Strivers%20Sheet%20A-Z/Strings/Medium/countSubstringwithKFreq.java) |
| 23 | **Smallest Window Containing All Chars** | 🔴 Hard | Meta, Amazon | **Sliding Window Frequency**: Expand right until window has all required chars, then shrink left. | [`longestPrefix.java`](../Strivers%20Sheet%20A-Z/Strings/Easy/longestPrefix.java) |
| 24 | **Check Valid Anagram** | 🟢 Easy | Uber, TCS, Meta | **Frequency Array**: Count char occurrences (+1 for str1, -1 for str2). Check if all 0. | [`anagrams.java`](../Strivers%20Sheet%20A-Z/Strings/Easy/anagrams.java) |
| 25 | **Group Anagrams Together** | 🟡 Medium | Amazon, Google | **Sorted String Key**: Sort each word alphabetically to make it a hashkey for its group. | [`GroupWordsByFirstChar.java`](../Training/Day-01/GroupWordsByFirstChar.java) |
| 26 | **Valid Parentheses / Expression** | 🟢 Easy | Meta, Amazon, TCS | **Stack Balancing**: Push open brackets, match with top on closing bracket. Stack must end empty. | [`BalancedParantheses.java`](../Strivers%20Sheet%20A-Z/Stack/BalancedParantheses.java) |
| 27 | **Sentence Palindrome** | 🟢 Easy | Meta, Microsoft | **Two Pointers Cleaning**: Ignore non-alphanumeric chars and case, compare pointers from ends. | [`Palindrome.java`](../Basic/Strings/Palindrome.java) |
| 28 | **Longest Palindromic Substring** | 🟡 Medium | Amazon, Meta | **Expand Around Center**: Treat each index (and index pair) as center and expand outwards. | [`longestPalindromeSubstring.java`](../Strivers%20Sheet%20A-Z/Strings/Medium/longestPalindromeSubstring.java) |
| 29 | **Palindromic Substrings Count** | 🟡 Medium | Google, Microsoft | **Expand Around Center**: Same center expansion, increment total count every valid palindrome. | [`longestPalindromeSubstring.java`](../Strivers%20Sheet%20A-Z/Strings/Medium/longestPalindromeSubstring.java) |
| 30 | **Longest Common Prefix** | 🟢 Easy | Amazon, Apple | **Horizontal Scanning**: Take 1st string as prefix, trim it until all strings start with it. | [`longestPrefix.java`](../Strivers%20Sheet%20A-Z/Strings/Easy/longestPrefix.java) |

---

## 3. Linked Lists

| # | Problem Name | Difficulty | Key Companies | Humanized Intuition / Pattern | Code Path in Repo |
|---|---|---|---|---|---|
| 31 | **Reverse a Linked List** | 🟢 Easy | Meta, Amazon, Apple, Microsoft | **Three Pointers**: Maintain `prev`, `curr`, `next`. Reverse link: `curr.next = prev`. | [`LinkedList.java`](../Strivers%20Sheet%20A-Z/LinkedList/LinkedList.java) |
| 32 | **Detect Cycle in Linked List** | 🟢 Easy | Amazon, Microsoft | **Floyd's Tortoise & Hare**: Fast moves 2 steps, Slow moves 1 step. If they meet, cycle exists! | [`LinkedListCycleII.java`](../Strivers%20Sheet%20A-Z/LinkedList/LinkedListCycleII.java) |
| 33 | **Merge Two Sorted Lists** | 🟢 Easy | Meta, Amazon | **Dummy Head Comparison**: Compare heads of both lists, attach smaller node to merged list. | [`LinkedList.java`](../Strivers%20Sheet%20A-Z/LinkedList/LinkedList.java) |
| 34 | **Merge K Sorted Lists** | 🔴 Hard | Google, Meta | **Min-Heap / Divide & Conquer**: Put heads of all K lists in Min-Heap. Poll smallest and add next node. | [`LinkedList.java`](../Strivers%20Sheet%20A-Z/LinkedList/LinkedList.java) |
| 35 | **Remove Nth Node From End** | 🟡 Medium | Amazon, Meta | **Fast & Slow Gap**: Advance `fast` pointer $N$ steps ahead, then move both together. | [`LinkedList.java`](../Strivers%20Sheet%20A-Z/LinkedList/LinkedList.java) |
| 36 | **Reorder List** | 🟡 Medium | Meta, Google | **Find Mid + Reverse + Interleave**: Split at mid, reverse 2nd half, merge alternatively. | [`Zigzag.java`](../Strivers%20Sheet%20A-Z/LinkedList/Zigzag.java) |
| 37 | **Add 1 to Number in Linked List** | 🟡 Medium | Amazon, Microsoft | **Reverse -> Add -> Reverse**: Reverse list, add 1 with carry propagation, reverse back. | [`AddOneToLL.java`](../Strivers%20Sheet%20A-Z/LinkedList/AddOneToLL.java) |
| 38 | **Find Middle of Linked List** | 🟢 Easy | Meta, Qualcomm | **Slow & Fast**: Fast moves 2 steps, slow moves 1. When fast reaches end, slow is at mid. | [`LinkedList.java`](../Strivers%20Sheet%20A-Z/LinkedList/LinkedList.java) |
| 39 | **Intersection Point of 2 LLs** | 🟢 Easy | Amazon, Meta | **Two Pointer Wrap**: Pointer A traverses list 1 then list 2; Pointer B traverses 2 then 1. They meet! | [`Intersection.java`](../Strivers%20Sheet%20A-Z/LinkedList/Intersection.java) |

---

## 4. Stacks & Queues

| # | Problem Name | Difficulty | Key Companies | Humanized Intuition / Pattern | Code Path in Repo |
|---|---|---|---|---|---|
| 40 | **Valid Parentheses** | 🟢 Easy | All FAANG + TCS | **Stack Matching**: Matching brackets with LIFO stack order. | [`BalancedParantheses.java`](../Strivers%20Sheet%20A-Z/Stack/BalancedParantheses.java) |
| 41 | **Infix to Postfix Conversion** | 🟡 Medium | TCS NQT, Wipro | **Shunting-Yard Algorithm**: Operator precedence stack to output postfix tokens. | [`InfixToPostfix.java`](../Strivers%20Sheet%20A-Z/Stack/Expression%20Evalution/InfixToPostfix.java) |
| 42 | **Next Greater Element** | 🟢 Easy | Amazon, Meta | **Monotonic Decreasing Stack**: Maintain stack of elements awaiting their next greater element. | [`NextGreaterElemOne.java`](../Strivers%20Sheet%20A-Z/Stack/Monotonic%20stack/NextGreaterElemOne.java) |
| 43 | **Largest Rectangle in Histogram**| 🔴 Hard | Google, Meta, Amazon | **Monotonic Stack Width**: Calculate area for each bar as shortest height using previous/next smaller. | [`LargestHistogram.java`](../Strivers%20Sheet%20A-Z/Stack/Monotonic%20stack/LargestHistogram.java) |

---

## 5. Trees & Binary Search Trees

| # | Problem Name | Difficulty | Key Companies | Humanized Intuition / Pattern | Code Path in Repo |
|---|---|---|---|---|---|
| 44 | **Maximum Depth of Binary Tree** | 🟢 Easy | Meta, Amazon | **Recursion DFS**: `1 + max(depth(left), depth(right))`. | *Fundamental Tree Concept* |
| 45 | **Invert / Flip Binary Tree** | 🟢 Easy | Google, Homebrew | **Recursive Swap**: Swap left and right child at every node recursively. | *Fundamental Tree Concept* |
| 46 | **Binary Tree Level Order Traversal** | 🟡 Medium | Meta, Amazon | **Queue BFS**: Process tree level-by-level using a Queue. | *Fundamental Tree Concept* |
| 47 | **Validate Binary Search Tree** | 🟡 Medium | Meta, Amazon | **Range Constraints**: Pass valid range `(minVal, maxVal)` down to children. | *Fundamental BST Concept* |
| 48 | **Lowest Common Ancestor of BST** | 🟢 Easy | Amazon, Meta | **BST Value Directing**: If both node values < curr, go left. If both >, go right. Else curr is LCA! | *Fundamental BST Concept* |

---

## 6. Trie, Heap, Graphs & DP Highlights

* **Implement Trie (Prefix Tree)** (`🟡 Medium`): Fast word searching and prefix lookup using character child arrays.
* **Top K Frequent Elements** (`🟡 Medium`): Min-Heap / Bucket Sort based frequency counting.
* **Course Schedule (Topological Sort)** (`🟡 Medium`): Directed graph cycle detection / Kahn's algorithm using In-degrees.
* **0/1 Knapsack & Coin Change** (`🟡 Medium`): Dynamic Programming choice logic (Include vs Exclude element).
* **Number of Islands (Grid BFS/DFS)** (`🟡 Medium`): Mark connected '1's as '0' to count land masses.

---

*This guide ensures you can navigate any top-tier corporate interview by identifying core algorithmic patterns!* 🚀
