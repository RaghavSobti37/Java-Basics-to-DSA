// Can define a linked list as well and implement these functions
// LinkedList<String> list = new LinkedList<>();

package DSA;
class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode; // Set the new node as the next node of the current last node
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null; // pointed to null and deleting lastNode
        return;
    }

    public int getSize(){
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next; // Move to the next node
        }

        System.out.print("NULL\n");
    }

    public void reverse_iterate(){
        // base case if the list is empty or has one element
        if (head == null || head.next == null) {
            return;
        } 
            Node prevNode = head;
            Node currNode = head.next;
            while (currNode != null) {
                Node nextNode = currNode.next; // pointing current node to previous node
                currNode.next = prevNode;

                prevNode = currNode; // moving pointers forward
                currNode = nextNode;
            }

            head.next = null;
            head = prevNode;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("end");

        list.printList();

        System.out.println(list.getSize());
        list.reverse_iterate();
        list.printList();
    }
}
