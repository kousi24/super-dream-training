LINKEDLIST:
 IN LINKEDLIST ALL ELEMENT LOOKS LIKE NODE.
NODE:
class ListNode {
    int val;
    ListNode next;
}
10 → 20 → 30 → null

Array vs Linked List
Array	Linked List
arr[0]	head
Index based	Node based
Fixed/resize costly	Dynamic
Direct access easy	Sequential traversal


Head → first node
head
 ↓
10 → 20 → 30 → null

TEMORARY HEAD TO TRAVERSE:

ListNode current = head;

while (current != null) {
    System.out.println(current.val);
    current = current.next;
    }
    OUTPUT:
10
20
30

1. Node creation → 2. Traversal → 3. Insertion → 4. Deletion → 5. Reverse → 6. Search

CREATING NODE:
Node n1 = new Node();
n1.data = 10;

Node n2 = new Node();
n2.data = 20;

Node n3 = new Node();
n3.data = 30;

NODES ARE LOOKING LIKE SEPERATE:
n1       n2       n3
10       20       30

TO CORRECT THIS
n1.next = n2;
n2.next = n3;

NOW
10->20->30->NULL

HEAD:
Node head = n1;

TRAVERSAL:
Node current = head;

while (current != null) {
    System.out.println(current.data);
    current = current.next;
}


INSERT:
CURRENT:10 → 20 → 30 → null
INSERT:5 → 10 → 20 → 30 → null

CODE:
Node newNode = new Node();
newNode.data = 5;

newNode.next = head;
head = newNode;

END:
CURRENT:10 → 20 → 30 → null
DELETE:10 → 20 → 30 → 40 → null

CODE:Node newNode = new Node();
newNode.data = 40;

Node current = head;

while (current.next != null) {
    current = current.next;
}

current.next = newNode;

INSERT SPECIFIC POSITION:
Node newNode = new Node();
newNode.data = 25;

Node current = head;

for (int i = 1; i < position; i++) {
    current = current.next;
}

newNode.next = current.next;
current.next = newNode;

SEARCH IN LINKEDLIST:
boolean search(Node head, int value) {
    Node current = head;

    while (current != null) {
        if (current.data == value)
            return true;

        current = current.next;
    }

    return false;
}

REVERSED LINKED LIST:
while (current != null) {
    next = current.next;
    current.next = prev;
    prev = current;
    current = next;
}
 COMPLETE CODE:
 Node reverse(Node head) {
    Node prev = null;
    Node current = head;

    while (current != null) {
        Node next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    return prev;
}




<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
| [0198-house-robber](https://github.com/kousi24/super-dream-training/tree/master/0198-house-robber) |
| [0212-word-search-ii](https://github.com/kousi24/super-dream-training/tree/master/0212-word-search-ii) |
| [0347-top-k-frequent-elements](https://github.com/kousi24/super-dream-training/tree/master/0347-top-k-frequent-elements) |
| [0373-find-k-pairs-with-smallest-sums](https://github.com/kousi24/super-dream-training/tree/master/0373-find-k-pairs-with-smallest-sums) |
| [0396-rotate-function](https://github.com/kousi24/super-dream-training/tree/master/0396-rotate-function) |
| [0403-frog-jump](https://github.com/kousi24/super-dream-training/tree/master/0403-frog-jump) |
| [0406-queue-reconstruction-by-height](https://github.com/kousi24/super-dream-training/tree/master/0406-queue-reconstruction-by-height) |
| [0407-trapping-rain-water-ii](https://github.com/kousi24/super-dream-training/tree/master/0407-trapping-rain-water-ii) |
| [0410-split-array-largest-sum](https://github.com/kousi24/super-dream-training/tree/master/0410-split-array-largest-sum) |
| [0413-arithmetic-slices](https://github.com/kousi24/super-dream-training/tree/master/0413-arithmetic-slices) |
| [0427-construct-quad-tree](https://github.com/kousi24/super-dream-training/tree/master/0427-construct-quad-tree) |
| [0500-keyboard-row](https://github.com/kousi24/super-dream-training/tree/master/0500-keyboard-row) |
| [0523-continuous-subarray-sum](https://github.com/kousi24/super-dream-training/tree/master/0523-continuous-subarray-sum) |
| [0525-contiguous-array](https://github.com/kousi24/super-dream-training/tree/master/0525-contiguous-array) |
| [0632-smallest-range-covering-elements-from-k-lists](https://github.com/kousi24/super-dream-training/tree/master/0632-smallest-range-covering-elements-from-k-lists) |
| [0999-available-captures-for-rook](https://github.com/kousi24/super-dream-training/tree/master/0999-available-captures-for-rook) |
| [1000-minimum-cost-to-merge-stones](https://github.com/kousi24/super-dream-training/tree/master/1000-minimum-cost-to-merge-stones) |
| [1001-grid-illumination](https://github.com/kousi24/super-dream-training/tree/master/1001-grid-illumination) |
| [1002-find-common-characters](https://github.com/kousi24/super-dream-training/tree/master/1002-find-common-characters) |
| [1004-max-consecutive-ones-iii](https://github.com/kousi24/super-dream-training/tree/master/1004-max-consecutive-ones-iii) |
| [1005-maximize-sum-of-array-after-k-negations](https://github.com/kousi24/super-dream-training/tree/master/1005-maximize-sum-of-array-after-k-negations) |
| [1007-minimum-domino-rotations-for-equal-row](https://github.com/kousi24/super-dream-training/tree/master/1007-minimum-domino-rotations-for-equal-row) |
| [1008-construct-binary-search-tree-from-preorder-traversal](https://github.com/kousi24/super-dream-training/tree/master/1008-construct-binary-search-tree-from-preorder-traversal) |
## Hash Table
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
| [0347-top-k-frequent-elements](https://github.com/kousi24/super-dream-training/tree/master/0347-top-k-frequent-elements) |
| [0398-random-pick-index](https://github.com/kousi24/super-dream-training/tree/master/0398-random-pick-index) |
| [0409-longest-palindrome](https://github.com/kousi24/super-dream-training/tree/master/0409-longest-palindrome) |
| [0424-longest-repeating-character-replacement](https://github.com/kousi24/super-dream-training/tree/master/0424-longest-repeating-character-replacement) |
| [0432-all-oone-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0432-all-oone-data-structure) |
| [0433-minimum-genetic-mutation](https://github.com/kousi24/super-dream-training/tree/master/0433-minimum-genetic-mutation) |
| [0500-keyboard-row](https://github.com/kousi24/super-dream-training/tree/master/0500-keyboard-row) |
| [0508-most-frequent-subtree-sum](https://github.com/kousi24/super-dream-training/tree/master/0508-most-frequent-subtree-sum) |
| [0523-continuous-subarray-sum](https://github.com/kousi24/super-dream-training/tree/master/0523-continuous-subarray-sum) |
| [0525-contiguous-array](https://github.com/kousi24/super-dream-training/tree/master/0525-contiguous-array) |
| [0632-smallest-range-covering-elements-from-k-lists](https://github.com/kousi24/super-dream-training/tree/master/0632-smallest-range-covering-elements-from-k-lists) |
| [1001-grid-illumination](https://github.com/kousi24/super-dream-training/tree/master/1001-grid-illumination) |
| [1002-find-common-characters](https://github.com/kousi24/super-dream-training/tree/master/1002-find-common-characters) |
## String
|  |
| ------- |
| [0211-design-add-and-search-words-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0211-design-add-and-search-words-data-structure) |
| [0212-word-search-ii](https://github.com/kousi24/super-dream-training/tree/master/0212-word-search-ii) |
| [0405-convert-a-number-to-hexadecimal](https://github.com/kousi24/super-dream-training/tree/master/0405-convert-a-number-to-hexadecimal) |
| [0409-longest-palindrome](https://github.com/kousi24/super-dream-training/tree/master/0409-longest-palindrome) |
| [0412-fizz-buzz](https://github.com/kousi24/super-dream-training/tree/master/0412-fizz-buzz) |
| [0424-longest-repeating-character-replacement](https://github.com/kousi24/super-dream-training/tree/master/0424-longest-repeating-character-replacement) |
| [0433-minimum-genetic-mutation](https://github.com/kousi24/super-dream-training/tree/master/0433-minimum-genetic-mutation) |
| [0434-number-of-segments-in-a-string](https://github.com/kousi24/super-dream-training/tree/master/0434-number-of-segments-in-a-string) |
| [0500-keyboard-row](https://github.com/kousi24/super-dream-training/tree/master/0500-keyboard-row) |
| [0520-detect-capital](https://github.com/kousi24/super-dream-training/tree/master/0520-detect-capital) |
| [0521-longest-uncommon-subsequence-i](https://github.com/kousi24/super-dream-training/tree/master/0521-longest-uncommon-subsequence-i) |
| [0564-find-the-closest-palindrome](https://github.com/kousi24/super-dream-training/tree/master/0564-find-the-closest-palindrome) |
| [1002-find-common-characters](https://github.com/kousi24/super-dream-training/tree/master/1002-find-common-characters) |
| [1003-check-if-word-is-valid-after-substitutions](https://github.com/kousi24/super-dream-training/tree/master/1003-check-if-word-is-valid-after-substitutions) |
## Divide and Conquer
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
| [0347-top-k-frequent-elements](https://github.com/kousi24/super-dream-training/tree/master/0347-top-k-frequent-elements) |
| [0427-construct-quad-tree](https://github.com/kousi24/super-dream-training/tree/master/0427-construct-quad-tree) |
## Sorting
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
| [0347-top-k-frequent-elements](https://github.com/kousi24/super-dream-training/tree/master/0347-top-k-frequent-elements) |
| [0406-queue-reconstruction-by-height](https://github.com/kousi24/super-dream-training/tree/master/0406-queue-reconstruction-by-height) |
| [0632-smallest-range-covering-elements-from-k-lists](https://github.com/kousi24/super-dream-training/tree/master/0632-smallest-range-covering-elements-from-k-lists) |
| [1005-maximize-sum-of-array-after-k-negations](https://github.com/kousi24/super-dream-training/tree/master/1005-maximize-sum-of-array-after-k-negations) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
| [0347-top-k-frequent-elements](https://github.com/kousi24/super-dream-training/tree/master/0347-top-k-frequent-elements) |
## Boyer–Moore Majority Vote Algorithm
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
## Dynamic Programming
|  |
| ------- |
| [0198-house-robber](https://github.com/kousi24/super-dream-training/tree/master/0198-house-robber) |
| [0396-rotate-function](https://github.com/kousi24/super-dream-training/tree/master/0396-rotate-function) |
| [0397-integer-replacement](https://github.com/kousi24/super-dream-training/tree/master/0397-integer-replacement) |
| [0403-frog-jump](https://github.com/kousi24/super-dream-training/tree/master/0403-frog-jump) |
| [0410-split-array-largest-sum](https://github.com/kousi24/super-dream-training/tree/master/0410-split-array-largest-sum) |
| [0413-arithmetic-slices](https://github.com/kousi24/super-dream-training/tree/master/0413-arithmetic-slices) |
| [0509-fibonacci-number](https://github.com/kousi24/super-dream-training/tree/master/0509-fibonacci-number) |
| [0600-non-negative-integers-without-consecutive-ones](https://github.com/kousi24/super-dream-training/tree/master/0600-non-negative-integers-without-consecutive-ones) |
| [0629-k-inverse-pairs-array](https://github.com/kousi24/super-dream-training/tree/master/0629-k-inverse-pairs-array) |
| [1000-minimum-cost-to-merge-stones](https://github.com/kousi24/super-dream-training/tree/master/1000-minimum-cost-to-merge-stones) |
## Depth-First Search
|  |
| ------- |
| [0211-design-add-and-search-words-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0211-design-add-and-search-words-data-structure) |
| [0404-sum-of-left-leaves](https://github.com/kousi24/super-dream-training/tree/master/0404-sum-of-left-leaves) |
| [0430-flatten-a-multilevel-doubly-linked-list](https://github.com/kousi24/super-dream-training/tree/master/0430-flatten-a-multilevel-doubly-linked-list) |
| [0501-find-mode-in-binary-search-tree](https://github.com/kousi24/super-dream-training/tree/master/0501-find-mode-in-binary-search-tree) |
| [0508-most-frequent-subtree-sum](https://github.com/kousi24/super-dream-training/tree/master/0508-most-frequent-subtree-sum) |
| [0513-find-bottom-left-tree-value](https://github.com/kousi24/super-dream-training/tree/master/0513-find-bottom-left-tree-value) |
| [0515-find-largest-value-in-each-tree-row](https://github.com/kousi24/super-dream-training/tree/master/0515-find-largest-value-in-each-tree-row) |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
| [0538-convert-bst-to-greater-tree](https://github.com/kousi24/super-dream-training/tree/master/0538-convert-bst-to-greater-tree) |
| [0572-subtree-of-another-tree](https://github.com/kousi24/super-dream-training/tree/master/0572-subtree-of-another-tree) |
| [0623-add-one-row-to-tree](https://github.com/kousi24/super-dream-training/tree/master/0623-add-one-row-to-tree) |
## Design
|  |
| ------- |
| [0211-design-add-and-search-words-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0211-design-add-and-search-words-data-structure) |
| [0432-all-oone-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0432-all-oone-data-structure) |
## Trie
|  |
| ------- |
| [0211-design-add-and-search-words-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0211-design-add-and-search-words-data-structure) |
| [0212-word-search-ii](https://github.com/kousi24/super-dream-training/tree/master/0212-word-search-ii) |
## Backtracking
|  |
| ------- |
| [0212-word-search-ii](https://github.com/kousi24/super-dream-training/tree/master/0212-word-search-ii) |
## Matrix
|  |
| ------- |
| [0212-word-search-ii](https://github.com/kousi24/super-dream-training/tree/master/0212-word-search-ii) |
| [0407-trapping-rain-water-ii](https://github.com/kousi24/super-dream-training/tree/master/0407-trapping-rain-water-ii) |
| [0427-construct-quad-tree](https://github.com/kousi24/super-dream-training/tree/master/0427-construct-quad-tree) |
| [0999-available-captures-for-rook](https://github.com/kousi24/super-dream-training/tree/master/0999-available-captures-for-rook) |
## Linked List
|  |
| ------- |
| [0430-flatten-a-multilevel-doubly-linked-list](https://github.com/kousi24/super-dream-training/tree/master/0430-flatten-a-multilevel-doubly-linked-list) |
| [0432-all-oone-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0432-all-oone-data-structure) |
| [0876-middle-of-the-linked-list](https://github.com/kousi24/super-dream-training/tree/master/0876-middle-of-the-linked-list) |
| [1290-convert-binary-number-in-a-linked-list-to-integer](https://github.com/kousi24/super-dream-training/tree/master/1290-convert-binary-number-in-a-linked-list-to-integer) |
## Two Pointers
|  |
| ------- |
| [0876-middle-of-the-linked-list](https://github.com/kousi24/super-dream-training/tree/master/0876-middle-of-the-linked-list) |
## Math
|  |
| ------- |
| [0396-rotate-function](https://github.com/kousi24/super-dream-training/tree/master/0396-rotate-function) |
| [0398-random-pick-index](https://github.com/kousi24/super-dream-training/tree/master/0398-random-pick-index) |
| [0405-convert-a-number-to-hexadecimal](https://github.com/kousi24/super-dream-training/tree/master/0405-convert-a-number-to-hexadecimal) |
| [0412-fizz-buzz](https://github.com/kousi24/super-dream-training/tree/master/0412-fizz-buzz) |
| [0507-perfect-number](https://github.com/kousi24/super-dream-training/tree/master/0507-perfect-number) |
| [0509-fibonacci-number](https://github.com/kousi24/super-dream-training/tree/master/0509-fibonacci-number) |
| [0523-continuous-subarray-sum](https://github.com/kousi24/super-dream-training/tree/master/0523-continuous-subarray-sum) |
| [0564-find-the-closest-palindrome](https://github.com/kousi24/super-dream-training/tree/master/0564-find-the-closest-palindrome) |
| [1006-clumsy-factorial](https://github.com/kousi24/super-dream-training/tree/master/1006-clumsy-factorial) |
| [1290-convert-binary-number-in-a-linked-list-to-integer](https://github.com/kousi24/super-dream-training/tree/master/1290-convert-binary-number-in-a-linked-list-to-integer) |
## Recursion
|  |
| ------- |
| [0509-fibonacci-number](https://github.com/kousi24/super-dream-training/tree/master/0509-fibonacci-number) |
## Memoization
|  |
| ------- |
| [0397-integer-replacement](https://github.com/kousi24/super-dream-training/tree/master/0397-integer-replacement) |
| [0509-fibonacci-number](https://github.com/kousi24/super-dream-training/tree/master/0509-fibonacci-number) |
## Tree
|  |
| ------- |
| [0404-sum-of-left-leaves](https://github.com/kousi24/super-dream-training/tree/master/0404-sum-of-left-leaves) |
| [0427-construct-quad-tree](https://github.com/kousi24/super-dream-training/tree/master/0427-construct-quad-tree) |
| [0429-n-ary-tree-level-order-traversal](https://github.com/kousi24/super-dream-training/tree/master/0429-n-ary-tree-level-order-traversal) |
| [0501-find-mode-in-binary-search-tree](https://github.com/kousi24/super-dream-training/tree/master/0501-find-mode-in-binary-search-tree) |
| [0508-most-frequent-subtree-sum](https://github.com/kousi24/super-dream-training/tree/master/0508-most-frequent-subtree-sum) |
| [0513-find-bottom-left-tree-value](https://github.com/kousi24/super-dream-training/tree/master/0513-find-bottom-left-tree-value) |
| [0515-find-largest-value-in-each-tree-row](https://github.com/kousi24/super-dream-training/tree/master/0515-find-largest-value-in-each-tree-row) |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
| [0538-convert-bst-to-greater-tree](https://github.com/kousi24/super-dream-training/tree/master/0538-convert-bst-to-greater-tree) |
| [0572-subtree-of-another-tree](https://github.com/kousi24/super-dream-training/tree/master/0572-subtree-of-another-tree) |
| [0623-add-one-row-to-tree](https://github.com/kousi24/super-dream-training/tree/master/0623-add-one-row-to-tree) |
| [1008-construct-binary-search-tree-from-preorder-traversal](https://github.com/kousi24/super-dream-training/tree/master/1008-construct-binary-search-tree-from-preorder-traversal) |
## Breadth-First Search
|  |
| ------- |
| [0404-sum-of-left-leaves](https://github.com/kousi24/super-dream-training/tree/master/0404-sum-of-left-leaves) |
| [0407-trapping-rain-water-ii](https://github.com/kousi24/super-dream-training/tree/master/0407-trapping-rain-water-ii) |
| [0429-n-ary-tree-level-order-traversal](https://github.com/kousi24/super-dream-training/tree/master/0429-n-ary-tree-level-order-traversal) |
| [0433-minimum-genetic-mutation](https://github.com/kousi24/super-dream-training/tree/master/0433-minimum-genetic-mutation) |
| [0513-find-bottom-left-tree-value](https://github.com/kousi24/super-dream-training/tree/master/0513-find-bottom-left-tree-value) |
| [0515-find-largest-value-in-each-tree-row](https://github.com/kousi24/super-dream-training/tree/master/0515-find-largest-value-in-each-tree-row) |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
| [0623-add-one-row-to-tree](https://github.com/kousi24/super-dream-training/tree/master/0623-add-one-row-to-tree) |
## Binary Search Tree
|  |
| ------- |
| [0410-split-array-largest-sum](https://github.com/kousi24/super-dream-training/tree/master/0410-split-array-largest-sum) |
| [0501-find-mode-in-binary-search-tree](https://github.com/kousi24/super-dream-training/tree/master/0501-find-mode-in-binary-search-tree) |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
| [0538-convert-bst-to-greater-tree](https://github.com/kousi24/super-dream-training/tree/master/0538-convert-bst-to-greater-tree) |
| [1004-max-consecutive-ones-iii](https://github.com/kousi24/super-dream-training/tree/master/1004-max-consecutive-ones-iii) |
| [1008-construct-binary-search-tree-from-preorder-traversal](https://github.com/kousi24/super-dream-training/tree/master/1008-construct-binary-search-tree-from-preorder-traversal) |
## Binary Tree
|  |
| ------- |
| [0404-sum-of-left-leaves](https://github.com/kousi24/super-dream-training/tree/master/0404-sum-of-left-leaves) |
| [0501-find-mode-in-binary-search-tree](https://github.com/kousi24/super-dream-training/tree/master/0501-find-mode-in-binary-search-tree) |
| [0508-most-frequent-subtree-sum](https://github.com/kousi24/super-dream-training/tree/master/0508-most-frequent-subtree-sum) |
| [0513-find-bottom-left-tree-value](https://github.com/kousi24/super-dream-training/tree/master/0513-find-bottom-left-tree-value) |
| [0515-find-largest-value-in-each-tree-row](https://github.com/kousi24/super-dream-training/tree/master/0515-find-largest-value-in-each-tree-row) |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
| [0538-convert-bst-to-greater-tree](https://github.com/kousi24/super-dream-training/tree/master/0538-convert-bst-to-greater-tree) |
| [0572-subtree-of-another-tree](https://github.com/kousi24/super-dream-training/tree/master/0572-subtree-of-another-tree) |
| [0623-add-one-row-to-tree](https://github.com/kousi24/super-dream-training/tree/master/0623-add-one-row-to-tree) |
| [1008-construct-binary-search-tree-from-preorder-traversal](https://github.com/kousi24/super-dream-training/tree/master/1008-construct-binary-search-tree-from-preorder-traversal) |
## Greedy
|  |
| ------- |
| [0397-integer-replacement](https://github.com/kousi24/super-dream-training/tree/master/0397-integer-replacement) |
| [0409-longest-palindrome](https://github.com/kousi24/super-dream-training/tree/master/0409-longest-palindrome) |
| [0410-split-array-largest-sum](https://github.com/kousi24/super-dream-training/tree/master/0410-split-array-largest-sum) |
| [0632-smallest-range-covering-elements-from-k-lists](https://github.com/kousi24/super-dream-training/tree/master/0632-smallest-range-covering-elements-from-k-lists) |
| [1005-maximize-sum-of-array-after-k-negations](https://github.com/kousi24/super-dream-training/tree/master/1005-maximize-sum-of-array-after-k-negations) |
| [1007-minimum-domino-rotations-for-equal-row](https://github.com/kousi24/super-dream-training/tree/master/1007-minimum-domino-rotations-for-equal-row) |
## Sliding Window
|  |
| ------- |
| [0413-arithmetic-slices](https://github.com/kousi24/super-dream-training/tree/master/0413-arithmetic-slices) |
| [0424-longest-repeating-character-replacement](https://github.com/kousi24/super-dream-training/tree/master/0424-longest-repeating-character-replacement) |
| [0632-smallest-range-covering-elements-from-k-lists](https://github.com/kousi24/super-dream-training/tree/master/0632-smallest-range-covering-elements-from-k-lists) |
| [1004-max-consecutive-ones-iii](https://github.com/kousi24/super-dream-training/tree/master/1004-max-consecutive-ones-iii) |
## Heap (Priority Queue)
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/kousi24/super-dream-training/tree/master/0347-top-k-frequent-elements) |
| [0373-find-k-pairs-with-smallest-sums](https://github.com/kousi24/super-dream-training/tree/master/0373-find-k-pairs-with-smallest-sums) |
| [0407-trapping-rain-water-ii](https://github.com/kousi24/super-dream-training/tree/master/0407-trapping-rain-water-ii) |
| [0632-smallest-range-covering-elements-from-k-lists](https://github.com/kousi24/super-dream-training/tree/master/0632-smallest-range-covering-elements-from-k-lists) |
## String Matching
|  |
| ------- |
| [0572-subtree-of-another-tree](https://github.com/kousi24/super-dream-training/tree/master/0572-subtree-of-another-tree) |
## Hash Function
|  |
| ------- |
| [0572-subtree-of-another-tree](https://github.com/kousi24/super-dream-training/tree/master/0572-subtree-of-another-tree) |
## DP on Trees
|  |
| ------- |
| [0508-most-frequent-subtree-sum](https://github.com/kousi24/super-dream-training/tree/master/0508-most-frequent-subtree-sum) |
## Prefix Sum
|  |
| ------- |
| [0410-split-array-largest-sum](https://github.com/kousi24/super-dream-training/tree/master/0410-split-array-largest-sum) |
| [0523-continuous-subarray-sum](https://github.com/kousi24/super-dream-training/tree/master/0523-continuous-subarray-sum) |
| [0525-contiguous-array](https://github.com/kousi24/super-dream-training/tree/master/0525-contiguous-array) |
| [1000-minimum-cost-to-merge-stones](https://github.com/kousi24/super-dream-training/tree/master/1000-minimum-cost-to-merge-stones) |
| [1004-max-consecutive-ones-iii](https://github.com/kousi24/super-dream-training/tree/master/1004-max-consecutive-ones-iii) |
## Pigeonhole Principle
|  |
| ------- |
| [0523-continuous-subarray-sum](https://github.com/kousi24/super-dream-training/tree/master/0523-continuous-subarray-sum) |
## Bucket Sort
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/kousi24/super-dream-training/tree/master/0347-top-k-frequent-elements) |
## Quickselect
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/kousi24/super-dream-training/tree/master/0347-top-k-frequent-elements) |
## Simulation
|  |
| ------- |
| [0412-fizz-buzz](https://github.com/kousi24/super-dream-training/tree/master/0412-fizz-buzz) |
| [0999-available-captures-for-rook](https://github.com/kousi24/super-dream-training/tree/master/0999-available-captures-for-rook) |
| [1006-clumsy-factorial](https://github.com/kousi24/super-dream-training/tree/master/1006-clumsy-factorial) |
## Stack
|  |
| ------- |
| [1003-check-if-word-is-valid-after-substitutions](https://github.com/kousi24/super-dream-training/tree/master/1003-check-if-word-is-valid-after-substitutions) |
| [1006-clumsy-factorial](https://github.com/kousi24/super-dream-training/tree/master/1006-clumsy-factorial) |
| [1008-construct-binary-search-tree-from-preorder-traversal](https://github.com/kousi24/super-dream-training/tree/master/1008-construct-binary-search-tree-from-preorder-traversal) |
## Monotonic Stack
|  |
| ------- |
| [1008-construct-binary-search-tree-from-preorder-traversal](https://github.com/kousi24/super-dream-training/tree/master/1008-construct-binary-search-tree-from-preorder-traversal) |
## Bit Manipulation
|  |
| ------- |
| [0397-integer-replacement](https://github.com/kousi24/super-dream-training/tree/master/0397-integer-replacement) |
| [0405-convert-a-number-to-hexadecimal](https://github.com/kousi24/super-dream-training/tree/master/0405-convert-a-number-to-hexadecimal) |
| [1009-complement-of-base-10-integer](https://github.com/kousi24/super-dream-training/tree/master/1009-complement-of-base-10-integer) |
## Reservoir Sampling
|  |
| ------- |
| [0398-random-pick-index](https://github.com/kousi24/super-dream-training/tree/master/0398-random-pick-index) |
## Randomized
|  |
| ------- |
| [0398-random-pick-index](https://github.com/kousi24/super-dream-training/tree/master/0398-random-pick-index) |
## Binary Indexed Tree
|  |
| ------- |
| [0406-queue-reconstruction-by-height](https://github.com/kousi24/super-dream-training/tree/master/0406-queue-reconstruction-by-height) |
## Segment Tree
|  |
| ------- |
| [0406-queue-reconstruction-by-height](https://github.com/kousi24/super-dream-training/tree/master/0406-queue-reconstruction-by-height) |
## Doubly-Linked List
|  |
| ------- |
| [0430-flatten-a-multilevel-doubly-linked-list](https://github.com/kousi24/super-dream-training/tree/master/0430-flatten-a-multilevel-doubly-linked-list) |
| [0432-all-oone-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0432-all-oone-data-structure) |
## Bidirectional Search
|  |
| ------- |
| [0433-minimum-genetic-mutation](https://github.com/kousi24/super-dream-training/tree/master/0433-minimum-genetic-mutation) |
<!---LeetCode Topics End-->



What is an Inverse Pair?

For an array, a pair (i, j) is an inverse pair when:

i < j
but
nums[i] > nums[j]

Example:

[2, 1, 3]

2 > 1, so there is 1 inverse pair.
2. Main DP Concept

We define:

dp[i][j]

as:

The number of ways to arrange i numbers so that there are exactly j inverse pairs.

For example:

dp[3][1]

means:

Number of permutations of [1,2,3] having exactly 1 inverse pair.
3. What happens when we add a new number?

Suppose we already have:

[1, 2, 3]

Now we add 4.

Where we place 4 determines how many new inverse pairs it creates:

4 at the end       → 0 new pairs
4 before 3         → 1 new pair
4 before 2,3       → 2 new pairs
4 at the beginning → 3 new pairs

So when adding number i, it can create:

0, 1, 2, ..., i-1

new inverse pairs.

Therefore:

dp[i][j]

comes from:

dp[i-1][j]
dp[i-1][j-1]
dp[i-1][j-2]
...
dp[i-1][j-(i-1)]
