# Java Bag (Multiset) Implementation

This project implements a generic **Bag** data structure (also known as a **Multiset**) in Java. Unlike traditional sets, a bag allows **duplicate elements** and stores the **frequency** of each element.

The included demo simulates a **vote counting system**, where each vote is represented by a candidate ID (integer). This mirrors real-world use cases such as election tallying, survey analysis, and inventory tracking.

---

##  Features

-  Add elements to the bag
-  Remove a single instance of an element
-  Check if an element exists
-  Count the number of times an element appears
-  Calculate total size (including duplicates)
-  Get a set of distinct elements
-  Merge two bags into one
-  Output contents as a formatted string via `toString()`

---

## 🗳️ Example Scenario: Vote Counter

Candidate IDs are integers like `101`, `102`, etc. The program simulates:

- Voting in two different regions
- Merging the vote counts into a combined result
- Showing distinct candidates
- Removing all votes for a disqualified candidate (e.g., 103)

---

## ▶ How to Run

```bash
javac Bag.java BagDemo.java
java BagDemo

## Example Output

Sample program output after demonstrating all features:

![Program Output](./Screenshots/Output.png)
