package in.balamt.practice.datastructures.doubly;

public class DoublyLinkedList {
    private Node head; // Head node of the linked list

    // Constructor to initialize an empty linked list
    public DoublyLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head != null) {
            head.prev = newNode; // Update the previous reference of the current head
        }
        newNode.next = head; // Set the next of the new node to the current head
        head = newNode; // Set the head to the new node
    }

    // Method to print all elements of the linked list
    public void printList() {
        Node current = head; // Start from the head node
        System.out.print("Linked list: ");
        while (current != null) {
            System.out.print(current.data + " "); // Print data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println();
    }
}