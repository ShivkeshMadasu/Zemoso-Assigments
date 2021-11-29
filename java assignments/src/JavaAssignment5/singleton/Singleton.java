package JavaAssignment5.singleton;

public class Singleton {
    String str;
    Singleton(String name)
    {
        str=name;
    }
    public static Singleton fun(String name)
    {
        //str=name; str cannot be referenced from static context
        return new Singleton(name);
    }
    public void print()
    {
        System.out.println(str);
    }
}
