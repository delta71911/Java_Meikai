package Chapter_04;
import java.util.Scanner;
public class FingerFlashing {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int hand;

        do {
            System.out.println("묵찌빠! 0:묵 1:찌 2:빠");
            hand = stdIn.nextInt();
        } while (hand < 0 || hand > 2);

        switch (hand) {
            case 1:
                System.out.println("묵");        break;
            case 2:
                System.out.println("찌");        break;
            case 3:
                System.out.println("빠");        break;
        }
    }
}
