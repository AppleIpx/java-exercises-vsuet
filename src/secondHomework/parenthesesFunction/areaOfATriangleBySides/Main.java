package secondHomework.parenthesesFunction.areaOfATriangleBySides;

//import firstHometask.findingTheNearestSquare.doWeGetATriangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите sideA:");
        int sideA = scanner1.nextInt();
        System.out.println("Введите sideB:");
        int sideB = scanner1.nextInt();
        System.out.println("Введите sideC:");
        int sideC = scanner1.nextInt();
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        if (triangle.checkForTriangle() && triangle.areaOfATriangle() != 0) {
            System.out.println("Вы сможете построить треугольник, а также площадь его равна: " + triangle.areaOfATriangle());
        } else if (triangle.checkForTriangle()) {
            System.out.println("Вы сможете построить треугольник, но посчитать площадь не удалось" );
        } else {
            System.out.println("Вы не сможете построить треугольник");
        }
    }
}
