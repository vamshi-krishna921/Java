# 🏢 TCS NQT & Mass Recruiter Master Placement Guide

> **Humanized Blueprint**: TCS NQT (National Qualifier Test) evaluates candidate readiness for **Ninja (3.3 - 3.6 LPA)** and **Digital / Prime (7.0 - 11.5 LPA)** roles. This guide synthesizes all past TCS papers, aptitude formulas, and 50+ repeated coding questions into a friendly, structured reference.

---

## 📌 TCS NQT Exam Structure & Pattern

| Section | Module Name | No. of Questions | Duration | Difficulty Level | Focus Areas |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Part A** | **Foundation Section** | ~65 Questions | 75 Mins | Medium | Numerical, Verbal, & Reasoning Ability |
| **Part B** | **Advanced Section** | ~20 Questions | 35 Mins | Medium - Hard | Advanced Quantitative, Advanced Logic |
| **Part C** | **Hands-on Coding** | 2 Questions | 45 Mins | Easy to Medium | 1 Basic Math/Array, 1 Intermediate DSA |

---

## 💻 Top 50 Most Repeated TCS NQT Coding Problems

Below are the 50 most repeated TCS coding questions with humanized logic breakdowns and exact repository paths:

### Category 1: Basic Math & Number Properties (1-15)

1. **Check Even or Odd**
   - *Logic*: Check `n % 2 == 0`.
   - *Repo Path*: [`EvenOdd.java`](../Basic/Math/EvenOdd.java)
2. **Check Prime Number**
   - *Logic*: Loop from 2 to $\sqrt{N}$. If any divides $N$, not prime.
   - *Repo Path*: [`Prime.java`](../Basic/Foundation%20mastery%20questions/Conditions%20and%20Loops/Prime.java)
3. **Factorial of a Number**
   - *Logic*: Iterative product `fact *= i` for $i \in [1, N]$.
   - *Repo Path*: [`Factorial.java`](../Basic/Functions/Factorial.java)
4. **Fibonacci Series (First N Terms)**
   - *Logic*: `a = 0, b = 1`, print $a$, update `c = a + b, a = b, b = c`.
   - *Repo Path*: [`Fibonacci.java`](../Basic/Math/Fibonacci.java)
5. **Reverse a Number**
   - *Logic*: `rev = rev * 10 + n % 10`, then `n /= 10`.
   - *Repo Path*: [`reverseNum.java`](../Basic/Functions/reverseNum.java)
6. **Palindrome Number**
   - *Logic*: Compare original number with its reversed value.
   - *Repo Path*: [`Palindrome.java`](../Basic/Foundation%20mastery%20questions/Conditions%20and%20Loops/Palindrome.java)
7. **Armstrong Number**
   - *Logic*: Sum of each digit raised to power of total digits equals original number.
   - *Repo Path*: [`armStrong.java`](../Basic/Functions/armStrong.java)
8. **Sum of Digits**
   - *Logic*: `sum += n % 10`, `n /= 10` until $n == 0$.
   - *Repo Path*: [`SumDigits.java`](../Basic/Math/SumDigits.java)
9. **GCD / HCF of Two Numbers**
   - *Logic*: Euclidean Algorithm `gcd(b, a % b)` until $b == 0$.
   - *Repo Path*: [`GCD.java`](../Basic/Math/GCD.java)
10. **LCM of Two Numbers**
    - *Logic*: $\text{LCM}(a, b) = \frac{(a \times b)}{\text{GCD}(a, b)}$.
    - *Repo Path*: [`LCM.java`](../Basic/Math/LCM.java)
11. **Leap Year Check**
    - *Logic*: `(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)`.
    - *Repo Path*: [`LeapYear.java`](../Basic/Foundation%20mastery%20questions/Conditions%20and%20Loops/LeapYear.java)
12. **Strong Number**
    - *Logic*: Sum of factorial of digits equals number itself (e.g. $145 = 1! + 4! + 5!$).
    - *Repo Path*: [`StrongNum.java`](../Basic/Math/StrongNum.java)
13. **Perfect Number**
    - *Logic*: Sum of proper divisors equals number itself (e.g. $6 = 1 + 2 + 3$).
    - *Repo Path*: [`PerfectNum.java`](../Basic/Math/PerfectNum.java)
14. **Decimal to Binary / Binary to Decimal**
    - *Logic*: Continual division by 2 or positional power of 2 sum.
    - *Repo Path*: [`decToBin.java`](../Basic/Math/decToBin.java) / [`binToDec.java`](../Basic/Math/binToDec.java)
15. **Power of a Number / Exponentiation**
    - *Logic*: Fast exponentiation $O(\log N)$ using bitwise shift.
    - *Repo Path*: [`fastExponentation.java`](../Basic/Bit%20manipulation/fastExponentation.java)

---

### Category 2: Array Manipulation & Searching (16-30)

16. **Find Smallest & Largest Element in Array**
    - *Repo Path*: [`LargestNumber.java`](../Basic/Array%20and%20searching/LargestNumber.java)
17. **Second Largest & Second Smallest Element**
    - *Repo Path*: [`SecondLargestAndSecondSmallest.java`](../Basic/Array%20and%20searching/SecondLargestAndSecondSmallest.java)
18. **Reverse an Array In-Place**
    - *Repo Path*: [`ReverseArray.java`](../Basic/Array%20and%20searching/ReverseArray.java)
19. **Calculate Sum and Average of Array Elements**
    - *Repo Path*: [`SumandAvg.java`](../Basic/Array%20and%20searching/SumandAvg.java)
20. **Count Frequency of Each Element in Array**
    - *Repo Path*: [`MostFreqElem.java`](../Training/Day-01/MostFreqElem.java)
21. **Sort Array (Bubble / Insertion / Quick Sort)**
    - *Repo Path*: [`Bubblesort.java`](../Basic/Sorting/Bubblesort.java)
22. **Find Missing Number in Array (1 to N)**
    - *Logic*: Expected Sum $\frac{N(N+1)}{2} - \text{Actual Sum}$.
    - *Repo Path*: [`FindMissingInArray.java`](../Basic/Array%20and%20searching/FindMissingInArray.java)
23. **Remove Duplicates from Sorted Array**
    - *Repo Path*: [`RemoveDupFromSortedArray.java`](../Strivers%20Sheet%20A-Z/Arrays/Easy/RemoveDupFromSortedArray.java)
24. **Move All Zeros to End of Array**
    - *Repo Path*: [`moveZerostoEnd.java`](../Strivers%20Sheet%20A-Z/Arrays/Easy/moveZerostoEnd.java)
25. **Rotate Array Left / Right by K Positions**
    - *Repo Path*: [`rotateArrayByKPos.java`](../Strivers%20Sheet%20A-Z/Arrays/Easy/rotateArrayByKPos.java)
26. **Find Equilibrium Index of Array**
    - *Logic*: Left Sum == Right Sum (Total Sum - Left Sum - Current Element).
    - *Repo Path*: [`subArraySumisK.java`](../Strivers%20Sheet%20A-Z/Arrays/Easy/subArraySumisK.java)
27. **Maximum Subarray Sum (Kadane's Algorithm)**
    - *Repo Path*: [`kadanes.java`](../Strivers%20Sheet%20A-Z/Arrays/Medium/kadanes.java)
28. **Find All Symmetric Pairs in Array**
    - *Repo Path*: [`PairsInArray.java`](../Basic/Array%20and%20searching/PairsInArray.java)
29. **Find Missing & Repeating Number**
    - *Repo Path*: [`missingRepeating.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/missingRepeating.java)
30. **Count Even and Odd Elements in Array**
    - *Repo Path*: [`EvenOddNums.java`](../Basic/Array%20and%20searching/EvenOddNums.java)

---

### Category 3: String Handling & Matrix Operations (31-50)

31. **Check Palindrome String**
    - *Repo Path*: [`Palindrome.java`](../Basic/Strings/Palindrome.java)
32. **Count Vowels, Consonants, and Spaces**
    - *Repo Path*: [`VowelOrConsonent.java`](../Basic/Strings/VowelOrConsonent.java)
33. **Remove Vowels from String**
    - *Repo Path*: [`RemoveVowels.java`](../Basic/Strings/RemoveVowels.java)
34. **Check Anagram Strings**
    - *Repo Path*: [`Anagram.java`](../Basic/Strings/Anagram.java)
35. **Capitalize First and Last Letter of Each Word**
    - *Repo Path*: [`UppercaseManually.java`](../Basic/Strings/UppercaseManually.java)
36. **String Compression (e.g. a3b2c1)**
    - *Repo Path*: [`StrCompression.java`](../Basic/Strings/StrCompression.java)
37. **Find Longest Word in Sentence**
    - *Repo Path*: [`LongestWord.java`](../Basic/Strings/LongestWord.java)
38. **Reverse Words in String**
    - *Repo Path*: [`reverseWords.java`](../Basic/Strings/reverseWords.java)
39. **Check Isomorphic Strings**
    - *Repo Path*: [`isomorphicString.java`](../Strivers%20Sheet%20A-Z/Strings/Easy/isomorphicString.java)
40. **Roman to Integer / Integer to Roman**
    - *Repo Path*: [`romanToInteger.java`](../Strivers%20Sheet%20A-Z/Strings/Medium/romanToInteger.java)
41. **Matrix Addition & Subtraction**
    - *Repo Path*: [`userInput.java`](../Basic/2D-Arrays/userInput.java)
42. **Matrix Transpose**
    - *Repo Path*: [`userInput.java`](../Basic/2D-Arrays/userInput.java)
43. **Spiral Matrix Printing**
    - *Repo Path*: [`spiralMatrix.java`](../Basic/2D-Arrays/spiralMatrix.java)
44. **Diagonal Sum of Matrix**
    - *Repo Path*: [`diagonalSum.java`](../Basic/2D-Arrays/diagonalSum.java)
45. **Rotate Matrix 90 Degrees Clockwise**
    - *Repo Path*: [`rotateMatrix.java`](../Strivers%20Sheet%20A-Z/Arrays/Medium/rotateMatrix.java)
46. **Hollow Star / Rhombus Pattern**
    - *Repo Path*: [`HollowRhombus.java`](../Basic/Patterns/HollowRhombus.java)
47. **Butterfly Pattern**
    - *Repo Path*: [`Butterfly.java`](../Basic/Patterns/Butterfly.java)
48. **Hourglass Pattern**
    - *Repo Path*: [`HourglassPattern.java`](../Basic/Patterns/HourglassPattern.java)
49. **Floyd's Triangle**
    - *Repo Path*: [`Floyds.java`](../Basic/Patterns/Floyds.java)
50. **Pascal's Triangle**
    - *Repo Path*: [`PascalsTriangle.java`](../Strivers%20Sheet%20A-Z/Arrays/Hard/PascalsTriangle.java)

---

## 🧮 Quantitative Aptitude & Verbal Strategy

### 1. High-Yield Quantitative Formulas

1. **Averages**: $\text{Average} = \frac{\text{Sum of all observations}}{\text{Total number of observations}}$.
2. **Speed, Distance & Time**: $\text{Speed} = \frac{\text{Distance}}{\text{Time}}$.
   - Conversion: $1 \text{ m/s} = \frac{18}{5} \text{ km/h}$; $1 \text{ km/h} = \frac{5}{18} \text{ m/s}$.
   - Average Speed (equal distances): $\frac{2xy}{x + y}$.
3. **Work & Time**: If $A$ can finish work in $X$ days, $A$'s 1-day work is $\frac{1}{X}$.
4. **Percentage & Profit/Loss**:
   - $\text{Profit \%} = \frac{\text{Profit}}{\text{Cost Price}} \times 100$.
   - $\text{Loss \%} = \frac{\text{Loss}}{\text{Cost Price}} \times 100$.
5. **Permutations & Combinations**:
   - $P(n, r) = \frac{n!}{(n-r)!}$, $C(n, r) = \frac{n!}{r!(n-r)!}$.

---

### 2. Email Writing Rules for TCS NQT Verbal Section

1. **Strict Key-Word Usage**: Ensure ALL given keywords/phrases in the question prompt are included in your response **without altering spelling**.
2. **Word Count Strictness**: Keep email strictly within **50 to 80 words**.
3. **Formal Tone**: Use formal greetings ("Dear Sir/Madam,") and standard formal sign-offs ("Best regards,").
4. **No Grammar/Typo Errors**: Avoid abbreviations (use "cannot" instead of "can't").

---

*This guide ensures maximum readiness for both TCS Ninja and TCS Digital roles!* 🚀
