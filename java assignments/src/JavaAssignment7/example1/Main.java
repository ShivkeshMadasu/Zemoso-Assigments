package JavaAssignment7.example1;

abstract class Rodent{
    Rodent(){
        System.out.println("In Rodent");
    }

    public abstract void info();
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("In Mouse");
    }

    public void info(){
        System.out.println(" Mouse belongs to Rodent Class.");
    }
}

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("In Gerbil");
    }

    public void info(){
        System.out.println(" Gerbil belongs to Rodent Class.");
    }
}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("In Hamster");
    }

    public void info(){
        System.out.println(" Hamster belongs to Rodent Class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].info();

        rodent[1] = new Gerbil();
        rodent[1].info();

        rodent[2] = new Hamster();
        rodent[2].info();
    }
}
