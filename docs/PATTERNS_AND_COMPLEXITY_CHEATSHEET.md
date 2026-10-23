# 📐 Patterns & Complexity Quick Reference Cheat Sheet

> **Humanized Visual Cheat Sheet**: Master time & space complexities, bit manipulation tricks, matrix formulas, pointer rules, and array patterns with intuitive mental shortcuts.

---

## ⏱️ Big-O Complexity Hierarchy

Visualizing execution times from fastest to slowest:

```
  O(1)  <  O(log N)  <  O(N)  <  O(N log N)  <  O(N²)  <  O(2ⁿ)  <  O(N!)
[Instant]  [Binary]   [Linear]   [Fast Sort]  [Nested] [Expon.] [Permut.]
```

| Complexity Name | Notation | Common Operations / Algorithms | Example Constraints ($N$) |
| :--- | :--- | :--- | :--- |
| **Constant** | $O(1)$ | Array lookup, Hashmap get/put, Stack push/pop, Arithmetic | $N \le 10^9$ |
| **Logarithmic** | $O(\log N)$ | Binary search, GCD Euclidean, Heap insertion/poll | $N \le 10^9$ |
| **Linear** | $O(N)$ | Single loop traversal, Kadane's, Two Pointers, Sliding Window | $N \le 10^7$ |
| **Log-Linear** | $O(N \log N)$ | Merge Sort, Quick Sort, Heap Sort, Counting Sort preprocessing | $N \le 10^6$ |
| **Quadratic** | $O(N^2)$ | Bubble sort, Insertion sort, Nested loop pairs, Grid BFS | $N \le 5000$ |
| **Cubic** | $O(N^3)$ | Matrix multiplication, Floyd-Warshall shortest path | $N \le 500$ |
| **Exponential** | $O(2^N)$ | Subset generation, Fibonacci recursive, N-Queens brute force | $N \le 20$ |
| **Factorial** | $O(N!)$ | Permutation generation, Traveling Salesperson brute force | $N \le 12$ |

---

## ⚡ Bitwise Manipulation Cheat Sheet

Bitwise operations process numbers directly at binary levels in $O(1)$ time and $O(1)$ auxiliary space.

| Operation | Formula / Code | Humanized Intuition | Example Repo File |
| :--- | :--- | :--- | :--- |
| **Check Even / Odd** | `(n & 1) == 0` | If last bit is 0, number is even. If 1, odd. | [`EvenOdd.java`](../Basic/Bit%20manipulation/EvenOdd.java) |
| **Check Power of 2** | `n > 0 && (n & (n - 1)) == 0` | Powers of 2 have exactly ONE binary 1 bit. | [`PowerOfTwo.java`](../Basic/Bit%20manipulation/PowerOfTwo.java) |
| **Get i-th Bit** | `(n & (1 << i)) != 0` | Shift 1 to index $i$, perform bitwise AND. | [`Get_i_th_bit.java`](../Basic/Bit%20manipulation/Get_i_th_bit.java) |
| **Set i-th Bit** | `n \| (1 << i)` | Shift 1 to index $i$, perform bitwise OR. | [`Set_i_th_bit.java`](../Basic/Bit%20manipulation/Set_i_th_bit.java) |
| **Clear i-th Bit** | `n & ~(1 << i)` | Invert shifted 1 bit, perform bitwise AND. | [`Clear_i_th_bit.java`](../Basic/Bit%20manipulation/Clear_i_th_bit.java) |
| **Swap 2 Numbers** | `a ^= b; b ^= a; a ^= b;` | Swaps values in-place without temp variable. | [`swapNumbers.java`](../Basic/Bit%20manipulation/swapNumbers.java) |
| **Clear LSB to i** | `n & (~0 << (i + 1))` | Clears all bits from bit 0 to bit $i$. | [`Clear_i_bits.java`](../Basic/Bit%20manipulation/Clear_i_bits.java) |
| **Count Set Bits** | `while(n > 0) { n &= (n - 1); count++; }` | Clears lowest set bit in each iteration. | [`CountSetBits.java`](../Basic/Bit%20manipulation/CountSetBits.java) |

---

## 🔁 Pointer & Matrix Manipulation Reference

### 1. Two Pointers Rules
- **Opposite Ends**: Search in sorted arrays or strings (`i = 0`, `j = len - 1`). Move `i++` or `j--`.
- **Fast & Slow**: Detecting cycles in Linked Lists (`slow = head`, `fast = head.next`).
- **In-Place Shift**: Partitioning zeros/negatives (`writeIdx` stays at target, `readIdx` scans).

### 2. Matrix Geometry Shortcuts
- **Transposing Matrix** ($N \times N$):
  ```java
  for(int i = 0; i < n; i++) {
      for(int j = i + 1; j < n; j++) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
      }
  }
  ```
- **Rotate Matrix 90° Clockwise**: Transpose Matrix $\rightarrow$ Reverse Each Row.
- **Rotate Matrix 90° Anti-Clockwise**: Transpose Matrix $\rightarrow$ Reverse Each Column.
- **Spiral Bounds**: `top = 0, bottom = row-1, left = 0, right = col-1`.

---

## 🛠️ Frequently Used Math Formulas

1. **Sum of First N Natural Numbers**: $S_N = \frac{N(N + 1)}{2}$
2. **Sum of Squares**: $S_{SQ} = \frac{N(N + 1)(2N + 1)}{6}$
3. **Number of Digits in Base B**: $\lfloor\log_B(N)\rfloor + 1$
4. **Euclidean GCD**:
   $$\text{gcd}(a, b) = \begin{cases} a & \text{if } b = 0 \\ \text{gcd}(b, a \pmod b) & \text{otherwise} \end{cases}$$

---

*Keep this reference handy during revision and live coding sessions!* 🚀
