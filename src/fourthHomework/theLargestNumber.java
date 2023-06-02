package fourthHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class theLargestNumber {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> largestNumber = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String userDit = scanner.nextLine();
        int length = userDit.length();
        StringBuilder result = new StringBuilder();
        if (length > 2) {
            String ReuserDit = userDit.substring(length - 2);
            for (int i = 0; i < ReuserDit.length(); i++) {
                char checkDit = ReuserDit.charAt(i);
                list.add(Integer.parseInt(String.valueOf(checkDit)));
            }
                while (list.size() != 1) {
                    int max = list.get(0);
                    int index = 0;
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j) > max) {
                            max = list.get(j);
                            index = j;
                        }
                    }
                    largestNumber.add(max);
                    list.remove(index);
                }
                largestNumber.add(list.get(0));
                result.append(userDit, 0, length - 2);
            for (int i = 0; i < largestNumber.size(); i++) {
                result.append(largestNumber.get(i));
            }
            if (Integer.parseInt(userDit) >= Integer.parseInt(String.valueOf(result))) {
                System.out.println(userDit + " ==> " + "-1");
            } else {
                System.out.println(userDit + " ==> " + result);
            }
        } else if (length == 1){
            System.out.println(userDit + " ==> " + "-1");
        } else {
            for (int i = 0; i < userDit.length(); i++) {
                char checkDit = userDit.charAt(i);
                list.add(Integer.parseInt(String.valueOf(checkDit)));
            }
                while (list.size() != 1) {
                    int max = list.get(0);
                    int index = 0;
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j) > max) {
                            max = list.get(j);
                            index = j;
                        }
                    }
                    largestNumber.add(max);
                    list.remove(index);
                }
                largestNumber.add(list.get(0));
                for (int i = 0; i < largestNumber.size(); i++) {
                result.append(largestNumber.get(i));
            }
            if (Integer.parseInt(userDit) >= Integer.parseInt(String.valueOf(result))) {
                System.out.println(userDit + " ==> " + "-1");
            } else {
                System.out.println(userDit + " ==> " + result);
            }
        }
    }
}
