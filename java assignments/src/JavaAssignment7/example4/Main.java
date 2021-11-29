package JavaAssignment7.example4;

interface Cycle{
    void factories();
}

class Unicycle implements Cycle
{
    public void factories(){
        System.out.println("Factories of Unicycle");
    }
}

class Bicycle implements Cycle
{
    public void factories(){
        System.out.println("Factories of Bicycle");
    }
}

class Tricycle implements Cycle
{
    public void factories(){
        System.out.println("Factories of tricycle");
    }
}
public class Main {
    public static void main(String[] args )
    {
        Unicycle cycle1 = new Unicycle();
        cycle1.factories();
        Bicycle cycle2 = new Bicycle();
        cycle2.factories();
        Tricycle cycle3 = new Tricycle();
        cycle3.factories();
    }
}
