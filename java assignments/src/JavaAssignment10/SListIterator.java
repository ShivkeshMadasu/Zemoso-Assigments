package JavaAssignment10;

public class SListIterator {

    Node head;
    SListIterator(Node head){
        this.head = head;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        //return list;
    }

    public void remove()
    {
        if(head.next!=null)
        {
            head= head.next;
        }
        else
        {
            head=null;
        }
    }

    public void printList() {
        Node temp = head;
        System.out.print("LinkedList: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}