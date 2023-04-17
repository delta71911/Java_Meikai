package Chapter_06;
import java.util.Scanner;
import java.util.Random;
public class FingerFlashing {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();
        String[] hands = {"바위", "가위", "보"};
        int retry;

        do {
            int comp = rand.nextInt(3);
            int user;

            do {
                System.out.printf("가위 바위 보!");
                for (int i = 0; i < 3; i++)
                    System.out.printf("(%d)%s " , i, hands[i]);
                System.out.printf(" : ");
                user = stdIn.nextInt();
            } while (user < 0 || user > 2);

            System.out.printf("나는 %s이고 당신은 %s입니다.\n", hands[comp], hands[user]);

            int judge = (user - comp + 3) % 3;
            switch (judge) {
                case 0:
                    System.out.println("비겼습니다."); break;
                case 1:
                    System.out.println("당신이 졌습니다."); break;
                case 2:
                    System.out.println("당신이 이겼습니다."); break;
            }

            do {
                System.out.printf("한번 더? 0: 아니오 1: 네");
                retry = stdIn.nextInt();
            } while (retry != 0 && retry != 1);
        } while (retry == 1);
    }
}
