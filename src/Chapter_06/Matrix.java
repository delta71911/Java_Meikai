package Chapter_06;
import java.util.Arrays;
public class Matrix {
    public static void main(String[] args) {
        int[][] a = { {1, 2, 3}, {4, 5, 6} };
        int[][] b = { {6, 3, 4}, {5, 1, 2} };
        int[][] c = { {0, 0, 0}, {0, 0, 0} };

        for (int i = 0; i < 2; i++)
            for(int j = 0; j < 3; j++)
                c[i][j] = a[i][j] + b[i][j];

        System.out.println("행렬a = " + Arrays.deepToString(a));
        System.out.println("행렬b = " + Arrays.deepToString(b));
        System.out.println("행렬c = " + Arrays.deepToString(c));
    }
}
