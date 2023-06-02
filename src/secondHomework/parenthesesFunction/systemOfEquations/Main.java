package secondHomework.parenthesesFunction.systemOfEquations;

public class Main {
    public static class EquationSolver {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return func(n / 2);
        } else {
            int n1 = n / 2;
            int n2 = n1 + 1;
            return func(n1) + func(n2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = func(n);
        System.out.println("func(" + n + ") = " + result);
    }
}
}
