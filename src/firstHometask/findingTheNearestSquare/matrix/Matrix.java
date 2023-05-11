package firstHometask.findingTheNearestSquare.matrix;

public class Matrix {
    private static final int DOWN = 0;
    private static final int UP = 10;

    private int[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = DOWN + (int) (Math.random() * UP);
            }
        }
    }

    public String transf() {
        String mat = "\n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mat += matrix[j][i] + " ";
            }
            mat += "\n";
        }
        return mat;
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
