package Chapter_03;
import java.util.Scanner;
public class Zero {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수치");
        int n = stdIn.nextInt();

        if(!(n != 0))
            System.out.println("그 수는 0입니다.");
        else
            System.out.println("그 수는 0이 아닙니다.");
    }
}
