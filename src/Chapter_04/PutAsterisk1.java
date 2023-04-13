package Chapter_04;
import java.util.Scanner;
public class PutAsterisk1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("*을 몇 개 표시할까요?");
        int n = stdIn.nextInt();

        int i = 0;
        while (i < n) {
            System.out.println("*");
            i++;
        }
        System.out.println();
    }
}
