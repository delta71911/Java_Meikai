package Chapter_03;
import java.util.Scanner;
public class FingerFlashing1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("선택하세요. (0:묵 1:찌 2:빠)");
        int hand = stdIn.nextInt();

        /*
        if (hand == 0)
            System.out.println("묵");
        else if (hand == 1)
            System.out.println("찌");
        else if (hand == 2)
            System.out.println("빠");
        */
        switch (hand) {
            case 0:
                System.out.println("묵");
                break;
            case 1:
                System.out.println("찌");
                break;
            case 2:
                System.out.println("빠");
                break;
        }

    }
}
