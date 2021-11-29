package JavaAssignment7.example2;

class Cycle{
}

class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Balance of Unicycle");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Balance of Bicycle");
    }
}
class Tricycle extends Cycle{

}
public class Main{
    public static void main(String[] args)
    {
        Cycle[] obj = new Cycle[3];
        //Upcast
        obj[0] = new Unicycle();
        obj[1] = new Bicycle();
        obj[2] = new Tricycle();

        /* obj[0].balance();
        obj[1].balance();
        obj[2].balance();
             error occurs as Cycle doesn't have balance() method
        */

        //Downcast
        Unicycle unicycle = (Unicycle)obj[0];
        unicycle.balance();

        Bicycle bicycle = (Bicycle)obj[1];
        bicycle.balance();

        Tricycle tricycle = (Tricycle)obj[2];
        // tricycle.balance(); error occurs as Tricycle doesn't have balance method.
    }
}
