package JavaAssignment10;

public class SList {
    Node head;
    SList()
    {
        head=null;
    }

    public SListIterator iterator()
    {
        return new SListIterator(head);
    }
}
