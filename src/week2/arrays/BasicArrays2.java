package week2.arrays;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] intList = new int[10];

        for(int i = 0; i < intList.length; i++) {
            int randomInt =  (int)Math.floor(Math.random()*(100)+1);
            intList[i] = randomInt;
            System.out.println("Slot " + i + " contains a " + intList[i]);
        }
    }
}
