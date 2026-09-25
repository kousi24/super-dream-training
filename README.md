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
| [0500-keyboard-row](https://github.com/kousi24/super-dream-training/tree/master/0500-keyboard-row) |
## Hash Table
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
| [0500-keyboard-row](https://github.com/kousi24/super-dream-training/tree/master/0500-keyboard-row) |
## String
|  |
| ------- |
| [0211-design-add-and-search-words-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0211-design-add-and-search-words-data-structure) |
| [0212-word-search-ii](https://github.com/kousi24/super-dream-training/tree/master/0212-word-search-ii) |
| [0500-keyboard-row](https://github.com/kousi24/super-dream-training/tree/master/0500-keyboard-row) |
| [0520-detect-capital](https://github.com/kousi24/super-dream-training/tree/master/0520-detect-capital) |
| [0521-longest-uncommon-subsequence-i](https://github.com/kousi24/super-dream-training/tree/master/0521-longest-uncommon-subsequence-i) |
| [0564-find-the-closest-palindrome](https://github.com/kousi24/super-dream-training/tree/master/0564-find-the-closest-palindrome) |
## Divide and Conquer
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
## Sorting
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
## Boyer–Moore Majority Vote Algorithm
|  |
| ------- |
| [0169-majority-element](https://github.com/kousi24/super-dream-training/tree/master/0169-majority-element) |
## Dynamic Programming
|  |
| ------- |
| [0198-house-robber](https://github.com/kousi24/super-dream-training/tree/master/0198-house-robber) |
| [0509-fibonacci-number](https://github.com/kousi24/super-dream-training/tree/master/0509-fibonacci-number) |
| [0600-non-negative-integers-without-consecutive-ones](https://github.com/kousi24/super-dream-training/tree/master/0600-non-negative-integers-without-consecutive-ones) |
| [0629-k-inverse-pairs-array](https://github.com/kousi24/super-dream-training/tree/master/0629-k-inverse-pairs-array) |
## Depth-First Search
|  |
| ------- |
| [0211-design-add-and-search-words-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0211-design-add-and-search-words-data-structure) |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
## Design
|  |
| ------- |
| [0211-design-add-and-search-words-data-structure](https://github.com/kousi24/super-dream-training/tree/master/0211-design-add-and-search-words-data-structure) |
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
## Linked List
|  |
| ------- |
| [0876-middle-of-the-linked-list](https://github.com/kousi24/super-dream-training/tree/master/0876-middle-of-the-linked-list) |
| [1290-convert-binary-number-in-a-linked-list-to-integer](https://github.com/kousi24/super-dream-training/tree/master/1290-convert-binary-number-in-a-linked-list-to-integer) |
## Two Pointers
|  |
| ------- |
| [0876-middle-of-the-linked-list](https://github.com/kousi24/super-dream-training/tree/master/0876-middle-of-the-linked-list) |
## Math
|  |
| ------- |
| [0507-perfect-number](https://github.com/kousi24/super-dream-training/tree/master/0507-perfect-number) |
| [0509-fibonacci-number](https://github.com/kousi24/super-dream-training/tree/master/0509-fibonacci-number) |
| [0564-find-the-closest-palindrome](https://github.com/kousi24/super-dream-training/tree/master/0564-find-the-closest-palindrome) |
| [1290-convert-binary-number-in-a-linked-list-to-integer](https://github.com/kousi24/super-dream-training/tree/master/1290-convert-binary-number-in-a-linked-list-to-integer) |
## Recursion
|  |
| ------- |
| [0509-fibonacci-number](https://github.com/kousi24/super-dream-training/tree/master/0509-fibonacci-number) |
## Memoization
|  |
| ------- |
| [0509-fibonacci-number](https://github.com/kousi24/super-dream-training/tree/master/0509-fibonacci-number) |
## Tree
|  |
| ------- |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
## Breadth-First Search
|  |
| ------- |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
## Binary Search Tree
|  |
| ------- |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
## Binary Tree
|  |
| ------- |
| [0530-minimum-absolute-difference-in-bst](https://github.com/kousi24/super-dream-training/tree/master/0530-minimum-absolute-difference-in-bst) |
<!---LeetCode Topics End-->



