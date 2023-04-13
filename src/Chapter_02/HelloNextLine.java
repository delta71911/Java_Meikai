package Chapter_02;
import java.util.Scanner;
public class HelloNextLine {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("이름은? ");
        String str = stdIn.nextLine();

        System.out.println("안녕하세요 " + str + "님!");
    }
}
