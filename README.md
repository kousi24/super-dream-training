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



 




