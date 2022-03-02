package week2.arraylists;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int randomInt =  (int)Math.floor(Math.random()*(100)+1);
            intList.add(randomInt);
        }
        System.out.println( "ArrayList: " + intList );
    }
}
