package week2.arraylists;

import java.util.ArrayList;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomInt = (int) Math.floor(Math.random() * (100) + 1);
            intList.add(randomInt);
        }
        System.out.println("ArrayList: " + intList);
        System.out.println("");

        int max = 0;
        int index = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (max < intList.get(i)) {
                max = intList.get(i);
                index = i;
            }
        }

        System.out.println("The largest value is " + max + ", which is in slot " + index);
    }
}
