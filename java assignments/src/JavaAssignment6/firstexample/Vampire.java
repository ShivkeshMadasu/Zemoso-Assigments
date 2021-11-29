package JavaAssignment6.firstexample;

public class Vampire {
    Boolean isVampire = false;

    //split the number and store in a array.
    public int[] splitNumbers(int input) {

        int length = (int) (Math.log10(input) + 1);
        int[] numberArray = new int[length];
        int remainder;
        int i = 0;

        while (input != 0) {
            remainder = input % 10;
            numberArray[i] = remainder;
            input /= 10;
            i++;
        }
        return numberArray;
    }

    //finds all the permutations of the number array
    void permute(int[] array, int index, int number) {

        if (index>= array.length-1) {
            if (checkVampire(array,number))
                isVampire=true;
        }

        for (int i = index; i< array.length; i++) {
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
            permute(array,index+1,number);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    //convert the array into two equal parts and check for the vampire number
    Boolean checkVampire(int[] array, int inputNumber) {
        int firstPart=0;
        int secondPart=0;
        int i;

        for (i =0; i <(array.length)/2; i++)
            firstPart+= array[i]*Math.pow(10,(array.length)/2- i -1);

        for (i =(array.length)/2; i < array.length; i++)
            secondPart+= array[i]*Math.pow(10,(array.length- i -1));

        return (firstPart * secondPart) == inputNumber;
    }
}
