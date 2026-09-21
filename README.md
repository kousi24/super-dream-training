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

