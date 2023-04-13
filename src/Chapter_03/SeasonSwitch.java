package Chapter_03;
import java.util.Scanner;
public class SeasonSwitch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("지금 몇 월인가요?");
        int month = stdIn.nextInt();

        switch(month) {
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            case 1, 2, 12:
                System.out.println("겨울");
                break;
            default:
                System.out.println("불분명합니다.");

        }
    }
}
