package JavaAssignment7.example5;

class FirstClass
{
    class FirstInnerClass
    {
        public FirstInnerClass(String name)
        {
            System.out.println("In FirstInnerClass:");
            System.out.println(name);
        }
    }
}

class SecondClass extends FirstClass
{
    class SecondInnerClass extends FirstInnerClass
    {
        public SecondInnerClass(String name)
        {
            super("Shivkesh");
            System.out.println("In SecondInnerClass:");
            System.out.println(name);
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        SecondClass.SecondInnerClass second = new SecondClass().new SecondInnerClass("Madasu");
    }
}

