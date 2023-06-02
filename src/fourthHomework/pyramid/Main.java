package fourthHomework.pyramid;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите высоту пирамидки");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            System.out.println("Введите массив находящийся на " + (i + 1) + " уровне, содержащий " + (height - i) + " элемента/ов");
            list.add(reader.readLine());
        }
        TheMaximumAmountOfThePyramid theMaximumAmountOfThePyramid = new TheMaximumAmountOfThePyramid(list, height);
        System.out.println(theMaximumAmountOfThePyramid);
        System.out.println("Программа посчитала " + theMaximumAmountOfThePyramid.findMaximum());
    }
}
