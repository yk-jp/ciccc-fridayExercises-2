package week2.arrays;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] intList = new int[10];

        System.out.print("Array:");
        for (int i = 0; i < intList.length; i++) {
            int randomInt = (int) Math.floor(Math.random() * (100) + 1);
            intList[i] = randomInt;
            System.out.print(" " + intList[i]);
        }
        System.out.println("");

        int max = 0;
        int index = 0;
        for (int i = 0; i < intList.length; i++) {
            if (max < intList[i]) {
                max = intList[i];
                index = i;
            }

        }

        System.out.println("The largest value is " + max);
        System.out.println("It is in slot " + index);
    }

}
