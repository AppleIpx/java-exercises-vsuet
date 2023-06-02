package fourthHomework.fromRomanNumeralsToArabic;

import fourthHomework.fromArabicNumeralsToRomanNumerals.Calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римский год, который необходимо перевести в арабский");
        String data = scanner.nextLine();
        Calculating calculating = new Calculating();
        System.out.println(calculating.calculate(data));
    }
}
