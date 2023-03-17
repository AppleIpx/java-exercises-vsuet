package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите координаты A");
        String coordinatesA = scanner1.nextLine();
//        System.out.println("Введите координаты В для");
//        String coordinatesB = scanner1.nextLine();
//        System.out.println("Введите координаты С");
//        String coordinatesC = scanner1.nextLine();
        Triangle triangle = new Triangle(coordinatesA);
        System.out.println(triangle.findingTheBarycenterOfATriangle());

    }
}
