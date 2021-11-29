package JavaAssignment6.firstexample;

public class Main {
    public static void main(String[] args) {
        Vampire vampire = new Vampire();
        int fistVampire = 1260;
        int count = 1;
        while (count <= 100)
        {
            if (((int) (Math.log10(fistVampire)+1))%2==0)
            {
                int[] numberArray=vampire.splitNumbers(fistVampire);
                vampire.permute(numberArray,0, fistVampire);

                if (vampire.isVampire)
                {
                    System.out.println(count+": "+fistVampire);
                    count++;
                    vampire.isVampire=false;
                }
            }
            fistVampire++;
        }
    }
}
