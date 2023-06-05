package fifthHomeWork.calculator;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();
        if (userText.equals("/history")) {
            try (FileReader reader = new FileReader("/Users/Eugeniy/PycharmProjects/Izvekov-E.A.-Java/src/fifthHomeWork/calculator/History")) {
                int c;
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
            }
        } else {
            //String function = "7 + 3 * |(-2^3 - 4)| % 23 / 2";
        //String function = " 4^2 + 5 ";
            String function = " 6 + 5 ";
        Calc calc = new Calc();
        System.out.println(calc.start(function));
        }
        //System.out.println(userFunction.indexOf("|"));
    }
}

