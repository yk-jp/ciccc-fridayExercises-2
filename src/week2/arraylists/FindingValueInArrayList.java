package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomInt = (int) Math.floor(Math.random() * (50) + 1);
            intList.add(randomInt);
        }
        System.out.println("ArrayList: " + intList);
        System.out.println("");

        System.out.println("Value to find: ");
        Scanner scanner = new Scanner(System.in);
        int searchValue = scanner.nextInt();

        System.out.println("");

        for (int i = 0; i < intList.size(); i++) {
            if (searchValue == intList.get(i)) {
                System.out.println(searchValue + " is in the arrayList.");
            }
        }
    }
}
