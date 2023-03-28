package secondHomework.parenthesesFunction.seriesOfNumbersAndTheSumOfDivisors;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите числa");
        String userText = scanner1.nextLine();
        String [] massi = userText.split(" ");
        String result = "";
        int sum = 0;

        for (int i = Integer.parseInt(massi[0]); i < Integer.parseInt(massi[1]); i++) {
            for (int j = 2; j < massi.length; j++) {
                if (i % Integer.parseInt(massi[j]) == 0 )
                    sum += i;
                }
            }
        System.out.println(sum);
        }
}
