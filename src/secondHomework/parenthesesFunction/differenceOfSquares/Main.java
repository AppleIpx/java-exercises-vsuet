package secondHomework.parenthesesFunction.differenceOfSquares;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Integer> allSquares = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите цифру");
        double userDits = scanner1.nextInt();
        if (userDits < 0 || userDits > 10000) {
            System.out.println("Ошибка ввода");
        } else {
            for (int i = 1; i < userDits; i++) {
                allSquares.add((int) Math.pow(i, 2));
            }
        }
        System.out.println(result(userDits));
    }

    public static String result(double userDits) {
        for (int i = 0; i < allSquares.size(); i++) {
            for (int j = 0; j < allSquares.size(); j++) {
                if (allSquares.get(i) - allSquares.get(j) == userDits) {
                    return ((int) userDits + " = " + allSquares.get(i) + " - " + allSquares.get(j));
                }
            }
        }
        return ("Таких значений не нашлось");
    }
}


