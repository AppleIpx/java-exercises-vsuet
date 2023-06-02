package fifthHomework.calculator;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String function = "7 + 3 * |(-2^3 - 4)| % 23 / 2";
        //String function = " 4^2 + 5 ";
        calc calc = new calc();
        System.out.println(calc.start(function));
        //System.out.println(userFunction.indexOf("|"));
    }
}
