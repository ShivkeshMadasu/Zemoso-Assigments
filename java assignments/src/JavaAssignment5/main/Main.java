package JavaAssignment5.main;

import JavaAssignment5.data.Data;
import JavaAssignment5.singleton.Singleton;

public class Main {
    public static void main(String[] args)
    {
        Data data = new Data();
        data.print1();
        data.print2();

        Singleton single = Singleton.fun("Shivkesh");
        single.print();

    }
}
