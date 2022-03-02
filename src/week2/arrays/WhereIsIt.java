package week2.arrays;

import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] intList = new int[10];

        System.out.print("Array:");
        for (int i = 0; i < intList.length; i++) {
            int randomInt = (int) Math.floor(Math.random() * (100) + 1);
            intList[i] = randomInt;
            System.out.print(" " + intList[i]);
        }
        System.out.println("");
        System.out.println("Value to find: ");
        Scanner scanner = new Scanner(System.in);
        int searchValue = scanner.nextInt();

        System.out.println("");

        int count = 0;
        for (int i = 0; i < intList.length; i++) {
            if (searchValue == intList[i]) {
                System.out.println(searchValue + " is in slot " + i);
                count++;
            }
        }

        if(count <=0) {
            System.out.println(searchValue + " is not in the array.");
        }
    }
}
