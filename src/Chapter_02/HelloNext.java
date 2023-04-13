package Chapter_02;
import java.util.Scanner;
public class HelloNext {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("이름은 무엇입니까?");
        String str = stdIn.next();

        System.out.println("안녕하세요 " + str + "님!");
    }
}
