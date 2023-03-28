package secondHomework.parenthesesFunction.theMaximumValueInTheArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static final int[] allDits = new int[10];
    public static final ArrayList<Integer> leftArrayList = new ArrayList<>();
    public static final ArrayList<Integer> rightArrayList = new ArrayList<>();
    private static final int DOWN = 0;
    private static final int UP = 100;
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            allDits[i] = DOWN + (int) (Math.random() * UP);
        }
        int max = allDits[0];
        int index = 0;
        for (int i = 1; i < allDits.length; i++) {
            if (allDits[i] > max) {
                max = allDits[i];
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            leftArrayList.add(allDits[i]);
        }
        for (int i = index + 1; i < allDits.length ; i++) {
            rightArrayList.add(allDits[i]);
        }
        System.out.println("Исходный массив " + Arrays.toString(allDits) + "\n" + "Массив слева от максимального числа " +leftArrayList + "\n" + "Массив справа от максимального числа " + rightArrayList);
    }
}
