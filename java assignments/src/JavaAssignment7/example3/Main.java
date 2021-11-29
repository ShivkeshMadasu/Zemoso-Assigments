package JavaAssignment7.example3;

interface One{
    public void student1();
    public void info1();
}
interface Two{
    public void student2();
    public void info2();
}
interface Three{
    public void student3();
    public void info3();
}

interface Four extends One, Two, Three {
    public void student4();

}

class ConcreteClass{
    public ConcreteClass()
    {
        System.out.println("Constructor of ConcreteClass");
    }
    public void info() {
        System.out.println("ConcreteClass's info method.");
    }
}

class Five extends ConcreteClass implements Four {
    @Override
    public void student1() {
        System.out.println("Interface One's student method.");
    }

    @Override
    public void info1() {
        System.out.println("Interface One's info method");
    }

    @Override
    public void student2() {
        System.out.println("Interface Two's student method.");
    }

    @Override
    public void info2() {
        System.out.println("Interface Two's info method");
    }

    @Override
    public void student3() {
        System.out.println("Interface Three's student method.");
    }

    @Override
    public void info3() {
        System.out.println("Interface Three's info method");
    }

    @Override
    public void student4() {
        System.out.println("Interface Four's student method.");
    }

}
public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Five five = new Five();
        five.info();
        main.method1(five);
        main.method2(five);
        main.method3(five);
        main.method4(five);

    }

    public void method1(One i) {
        System.out.println("Method 1:");
        i.student1();
        i.info1();
    }
    public void method2(Two i) {
        System.out.println("Method 2:");
        i.student2();
        i.info2();
    }
    public void method3(Three i) {
        System.out.println("Method 3:");
        i.student3();
        i.info3();
    }
    public void method4(Four i) {
        System.out.println("Method 4:");
        i.student4();
    }
}
