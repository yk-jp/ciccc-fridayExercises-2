package week2.arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] intList = new int[10];
        int[] copyList = new int[10];

        for (int i = 0; i < intList.length; i++) {
            int randomInt = (int) Math.floor(Math.random() * (100) + 1);
            intList[i] = randomInt;
        }

        for (int i = 0; i < intList.length; i++) {
            copyList[i] = intList[i];
            if (i == intList.length - 1) intList[i] = -7;
        }

        System.out.print("Array 1:");

        for (int i = 0; i < intList.length; i++) {
            System.out.print(" " + intList[i]);
        }
        System.out.println("");

        System.out.print("Array 2:");

        for (int i = 0; i < copyList.length; i++) {
            System.out.print(" " + copyList[i]);
        }
        System.out.println("");
    }
}
