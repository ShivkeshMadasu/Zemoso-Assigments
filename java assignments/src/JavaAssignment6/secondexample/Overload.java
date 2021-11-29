package JavaAssignment6.secondexample;

public class Overload {
    public Overload(String firstName, String lastName)
    {
        this(firstName);
        System.out.println(lastName);
    }

    public Overload(String firstName)
    {
        System.out.print(firstName+" ");
    }

    public static void main(String[] args)
    {
        Overload over = new Overload("Shivkesh","Madasu");
    }
}