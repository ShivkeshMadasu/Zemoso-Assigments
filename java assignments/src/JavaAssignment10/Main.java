package JavaAssignment10;

public class Main {
    public static void main(String[] args)
    {
        SList list = new SList();
        SListIterator listIterator = list.iterator();

        listIterator.insert(10);
        listIterator.insert(20);
        listIterator.insert(30);
        listIterator.insert(40);

        listIterator.remove();
        //listIterator.remove();
        listIterator.printList();
    }
}
