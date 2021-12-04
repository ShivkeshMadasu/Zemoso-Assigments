package introduction;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true , isWarm = false;
        boolean combined;
        combined = isRaining && isWarm;
        System.out.println("is it raining and warm ?: " + combined);
        combined = isRaining || isWarm;
        System.out.println("is it raining or war ?: " + combined);
        combined = !isRaining;
        System.out.println("is not raining ?: " + combined);
        System.out.println("\n");
        isRaining = false ; isWarm = false;
        combined = isRaining && isWarm;
        System.out.println("is it raining and warm ?: " + combined);
        combined = isRaining || isWarm;
        System.out.println("is it raining or war ?: " + combined);
        combined = !isRaining;
        System.out.println("is not raining ?: " + combined);
        System.out.println("\n");
        isRaining = false ; isWarm = false ;
        combined = isRaining && isWarm;
        System.out.println("is it raining and warm ?: " + combined);
        combined = isRaining || isWarm;
        System.out.println("is it raining or war ?: " + combined);
        combined = !isRaining;
        System.out.println("is not raining ?: " + combined);
    }
}
