package fourthHomework.fromArabicNumeralsToRomanNumerals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год, который необходимо конвертировать в римский вид");
        int years = scanner.nextInt();
        Calculate calculate = new Calculate();
        calculate.calculating(years);
        System.out.println(calculate);
    }
}
