package Chapter_06;
import java.util.Arrays;
public class AssignArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 5, 4, 3, 2, 1, 0};

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

        b = a;
        a[0] = 10;

        System.out.println("a를 b에 대입해 a[0]에 10을 넣었습니다.");
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
