public class CreatingLambdas {
    @FunctionalInterface
    interface Greeting
    {
        String sayHello(String g);
    }

    public void testGreeting(String a, Greeting g)
    {
        String result = g.sayHello(a);
        System.out.println("Result: " +result);
    }

    public static void main(String[] args)
    {
        new CreatingLambdas().testGreeting("Shivkesh", (String s)->"Hello "+s);
        new CreatingLambdas().testGreeting("Rushikesh", (String s)->"Hello "+s);
        new CreatingLambdas().testGreeting("", (String s)-> s.isEmpty() ? "Did you miss Something?" : "Hello "+s);
    }
}
