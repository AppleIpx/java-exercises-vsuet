package secondHomework.parenthesesFunction.ringFilling;

public class Matrix {
    private static final int ONE = 1;
    private int[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ONE;
            }
        }
    }
    private void filingRing () {

    }
    @Override
    public String toString() {
        String matrixa = "\n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixa += matrix[i][j] + " ";
            }
            matrixa += "\n";
        }
        return matrixa;
    }
}
