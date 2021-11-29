package JavaAssignment5.data;

public class Data {
    int a;
    char ch;
    public void print1()
    {
        System.out.println("Int: " +a);
        System.out.println("Char: " +ch);
    }
    public void print2()
    {
        int b = 10;
        char c = 'S';
        // Not able to print without initializing local variables
        System.out.println("Integer: " +b);
        System.out.println("Character: " +c);
    }
}
