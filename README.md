# 🚀 Ultimate Data Structures & Algorithms (DSA)

> **Welcome!** Whether you're preparing for tier-1 tech giants like **Google, Amazon, Meta, Microsoft, Apple, Uber**, or preparing for high-volume campus recruitment like **TCS NQT, Infosys, Wipro, Accenture**, this repository is designed to be your **friendly, intuitive,   companion**.

---

DSA can feel mechanical and intimidating with dry math formulas and abstract pseudocode. **  documentation** breaks down complex concepts into everyday analogies, visual mental models, and intuitive step-by-step logic before writing a single line of code.

### 🌟 Core Philosophy:
1. **Analogy First**: Understand *why* a pattern works using real-world intuition (e.g., Two Pointers as two runners on a track).
2. **Visual Flow**: Picture the data structure morphing step-by-step.
3. **Pattern Recognition**: Don't memorize 500+ individual questions; master the ~15 foundational patterns that solve 90% of interview problems.
4. **Company Alignment**: Know exactly which companies ask which patterns and why!

---

## 🗺️ Complete Repository Roadmap

Our repository is organized into distinct learning modules tailored for progression:

| Directory | Target Focus | Level | Description |
| :--- | :--- | :--- | :--- |
| `Basic/` | Fundamentals & Logic Building | Beginner | Data types, loops, math, 1D/2D arrays, string manipulation, bitwise operations, basic sorting, and star patterns. |
| `Strivers Sheet A-Z/` | Product-Based & FAANG Prep | Medium - Hard | Arrays, Binary Search, Linked Lists, Stacks & Queues, Monotonic Stacks, Expression Evaluation, Strings. |
| `DSA/ArrayList/` | Java Collections Deep Dive | Intermediate | Dynamic arrays, custom operations, memory management, and list manipulation. |
| `Training/Day-01/` | Corporate Aptitude & Speed Coding | Intermediate | Fast array processing, frequency counts, grouping, sliding windows, and in-place manipulations. |
| `TCS NQT-20260311T140933Z-3-001/` | Service Sector & Mass Recruiters | All Levels | Dedicated section containing past TCS NQT papers, aptitude guides, 50+ solved NQT coding problems, and verbal/quant sets. |

---

## 🎯 Master Algorithmic Patterns & Company Mappings

Below is the **Master Map** connecting key problem-solving patterns to real-world interview trends:

```
                          ┌──────────────────────────┐
                          │   DSA MASTER PATTERNS    │
                          └─────────────┬────────────┘
                                        │
        ┌───────────────────────────────┼───────────────────────────────┐
        ▼                               ▼                               ▼
 ┌──────────────┐                ┌──────────────┐                ┌──────────────┐
 │ Two Pointers │                │ Sliding Win  │                │ Binary Search│
 └──────┬───────┘                └──────┬───────┘                └──────┬───────┘
        │                               │                               │
  • Two Sum                       • Longest Substring             • Rotated Sorted
  • Trapping Rain Water           • Max Sum Subarray              • Allocate Books
  • Container Most Water          • Anagram Permutations          • Koko Eating Bananas
        │                               │                               │
  🏢 Meta, Amazon, Apple           🏢 Google, Microsoft            🏢 Uber, Google, TCS
```

---

### 1. Two Pointers Pattern
* **Intuition**: Think of two runners starting at opposite ends of a linear track (or same end at different speeds) moving towards each other based on conditions.
* **When to use**: Sorted arrays/strings, searching for pairs, partitioning, or in-place reversals.
* **Company Tags**: Meta, Amazon, Microsoft, TCS NQT, Adobe.
* **Key Repo Solutions**:
  - [`TwoSum.java`](Strivers%20Sheet%20A-Z/Arrays/Medium/TwoSum.java)
  - [`ThreeSum.java`](Strivers%20Sheet%20A-Z/Arrays/Hard/ThreeSum.java)
  - [`containerMostWater.java`](Strivers%20Sheet%20A-Z/Arrays/Hard/containerMostWater.java)
  - [`trappingRainWater.java`](Strivers%20Sheet%20A-Z/Arrays/Hard/trappingRainWater.java)
  - [`moveZerostoEnd.java`](Strivers%20Sheet%20A-Z/Arrays/Easy/moveZerostoEnd.java)

### 2. Sliding Window (Fixed & Dynamic)
* **Intuition**: Imagine looking at a long strip through a sliding magnifying glass. You expand the window on the right to include items and shrink from the left to maintain balance.
* **When to use**: Subarrays or substrings with contiguous target constraints (e.g., maximum sum, longest substring without duplicates).
* **Company Tags**: Google, Meta, Amazon, Goldman Sachs.
* **Key Repo Solutions**:
  - [`LongestSubArraySumk.java`](Strivers%20Sheet%20A-Z/Arrays/Easy/LongestSubArraySumk.java)
  - [`countSubstringwithKFreq.java`](Strivers%20Sheet%20A-Z/Strings/Medium/countSubstringwithKFreq.java)
  - [`sumOfBeautyOfSubstrings.java`](Strivers%20Sheet%20A-Z/Strings/Medium/sumOfBeautyOfSubstrings.java)

### 3. Binary Search on Search Space & 2D Grids
* **Intuition**: Guessing a secret number between 1 and 100. Every time you guess, you are told "too high" or "too low", halving the possibilities instantly ($O(\log N)$).
* **When to use**: Searching in sorted ranges or finding an optimal minimum/maximum value (BS on Answers).
* **Company Tags**: Uber, Google, Amazon, TCS Digital, Paytm.
* **Key Repo Solutions**:
  - [`BinarySearch.java`](Strivers%20Sheet%20A-Z/Binary%20Search/BS%201D-Arrays/BinarySearch.java)
  - [`searchInRotatedArray.java`](Strivers%20Sheet%20A-Z/Binary%20Search/BS%201D-Arrays/searchInRotatedArray.java)
  - [`KokoEatingBananas.java`](Strivers%20Sheet%20A-Z/Binary%20Search/BS%20On%20Answers/KokoEatingBananas.java)
  - [`AllocateBooks.java`](Strivers%20Sheet%20A-Z/Binary%20Search/BS%20On%20Answers/AllocateBooks.java)
  - [`PeakElemII.java`](Strivers%20Sheet%20A-Z/Binary%20Search/BS%20On%202D/PeakElemII.java)

### 4. Monotonic Stack & Expression Evaluation
* **Intuition**: A cafeteria tray stack where every new plate is either larger or smaller than the one below it, allowing instant retrieval of the "next greater element".
* **When to use**: Nearest smaller/greater element lookup, histogram areas, operator precedence parsing.
* **Company Tags**: Amazon, Meta, Microsoft, TCS NQT, Cognizant.
* **Key Repo Solutions**:
  - [`NextGreaterElemOne.java`](Strivers%20Sheet%20A-Z/Stack/Monotonic%20stack/NextGreaterElemOne.java)
  - [`LargestHistogram.java`](Strivers%20Sheet%20A-Z/Stack/Monotonic%20stack/LargestHistogram.java)
  - [`InfixToPostfix.java`](Strivers%20Sheet%20A-Z/Stack/Expression%20Evalution/InfixToPostfix.java)
  - [`BasicCalculatorTwo.java`](Strivers%20Sheet%20A-Z/Stack/Expression%20Evalution/BasicCalculaterTwo.java)

### 5. In-place Matrix Traversal & Manipulation
* **Intuition**: Reading a matrix layer by layer like peeling an onion, or flipping it along its diagonal.
* **When to use**: Grid rotations, spiral printing, state-marking in 2D grids.
* **Company Tags**: Microsoft, Apple, TCS NQT, Infosys.
* **Key Repo Solutions**:
  - [`spiralMatrix.java`](Basic/2D-Arrays/spiralMatrix.java) / [`Spiralmatrix.java`](Strivers%20Sheet%20A-Z/Arrays/Medium/Spiralmatrix.java)
  - [`setMatrixZeros.java`](Strivers%20Sheet%20A-Z/Arrays/Medium/setMatrixZeros.java)
  - [`rotateMatrix.java`](Strivers%20Sheet%20A-Z/Arrays/Medium/rotateMatrix.java)

---

## 🏢 Target Company Interview Reference

For detailed company preparation guides, view our sub-guides in the `docs/` folder:

1. 📄 **[Top 100 FAANG & Tier-1 Company DSA Guide](docs/TOP_100_FAANG_GUIDE.md)**
   - Curated list covering Array, String, Linked List, Stack, Tree, Graph, DP, Heap & Trie problems tagged with difficulty and repository source locations.
2. 🏢 **[TCS NQT & Mass Recruiter Master Guide](docs/TCS_NQT_AND_SERVICE_COMPANIES_GUIDE.md)**
   - Complete breakdown of TCS NQT pattern, 50 most repeated NQT programming problems (Armstrong, Prime, Fibonacci, Matrices, Series), quantitative aptitude concepts, and verbal ability strategies.
3. 📐 **[Comprehensive Patterns & Complexity Cheat Sheet](docs/PATTERNS_AND_COMPLEXITY_CHEATSHEET.md)**
   - Quick reference for Time & Space Complexities ($O(1)$ to $O(2^N)$), Bitwise Tricks, Matrix Operations, Math formulas, and Linked List pointer manipulations.

---

## ⏱️ Time & Space Complexity Quick Cheat Sheet

| Data Structure / Algorithm | Access | Search | Insertion | Deletion | Worst Space |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Array** | $O(1)$ | $O(N)$ | $O(N)$ | $O(N)$ | $O(N)$ |
| **ArrayList (Dynamic)** | $O(1)$ | $O(N)$ | $O(1)$ amortized | $O(N)$ | $O(N)$ |
| **Singly Linked List** | $O(N)$ | $O(N)$ | $O(1)$ (at head) | $O(1)$ | $O(N)$ |
| **Doubly Linked List** | $O(N)$ | $O(N)$ | $O(1)$ | $O(1)$ | $O(N)$ |
| **Stack (Array/LL)** | $O(N)$ | $O(N)$ | $O(1)$ | $O(1)$ | $O(N)$ |
| **Binary Search** | - | $O(\log N)$ | - | - | $O(1)$ |
| **Merge Sort** | - | - | - | - | $O(N)$ |
| **Quick Sort** | - | - | - | - | $O(\log N)$ |

---

## 💻 How to Run Code Solutions

All Java programs in this repository are self-contained and standard-compliant.

To compile and run any Java file (e.g. `TwoSum.java`):

```bash
# Navigate to the folder
cd "Strivers Sheet A-Z/Arrays/Medium"

# Compile
javac TwoSum.java

# Run
java TwoSum
```

---

## 🤝 Contribution & Learning Roadmap

- [x] Basic Math & Star Patterns Mastery
- [x] Strivers A-Z Arrays, Strings, Binary Search & Stack
- [x] TCS NQT Past Questions & Technical Aptitude
- [ ] Trees, Graphs, and Dynamic Programming Expansion

*Happy Coding! Knowledge is best retained when understood with human intuition.* 🌟
