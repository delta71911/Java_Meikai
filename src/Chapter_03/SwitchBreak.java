package Chapter_03;
import java.util.Scanner;
public class SwitchBreak {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수");
        int n = stdIn.nextInt();

        switch (n) {
            case 0:
                System.out.println("A");
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
            case 5:
                System.out.println("D");
                break;
            case 6:
            case 7:
                System.out.println("F");
                break;
        }
        System.out.println();
    }
}
