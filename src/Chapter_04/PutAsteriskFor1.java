package Chapter_04;
import java.util.Scanner;
public class PutAsteriskFor1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("*이 몇개?");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++)
            System.out.println('*');
        System.out.println();
    }
}
