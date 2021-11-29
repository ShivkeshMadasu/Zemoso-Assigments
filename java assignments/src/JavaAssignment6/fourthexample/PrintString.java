package JavaAssignment6.fourthexample;

public class PrintString {
    public PrintString(String name)
    {
        System.out.print(name+" ");
    }

    public static void main(String[] args)
    {
        PrintString[] printString = new PrintString[2];
        printString[0] = new PrintString("Shivkesh");
        printString[0] = new PrintString("Madasu");
    }
}
