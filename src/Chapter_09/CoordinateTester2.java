package Chapter_09;
import java.util.Scanner;
public class CoordinateTester2 {
    static boolean compCoordinate(Coordinate c1, Coordinate c2) {
        return c1.getX() == c2.getX() && c1.getY() == c2.getY();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double x, y;
        System.out.println("좌표p를 입력하세요.");
        System.out.print("x의 좌표 : ");   x = stdIn.nextDouble();
        System.out.print("y의 좌표 : ");   y = stdIn.nextDouble();
        Coordinate p = new Coordinate(x, y);

        System.out.println("좌표q를 입력하세요.");
        System.out.print("x의 좌표 : ");   x = stdIn.nextDouble();
        System.out.print("y의 좌표 : ");   y = stdIn.nextDouble();
        Coordinate q = new Coordinate(x, y);

        System.out.println((p == q) ? "p == q입니다." : "p != q입니다.");
        System.out.println(p.getX() == q.getX() && p.getY() == q.getY() ? "p와 q는 같습니다." : "p와 q는 같지않습니다.");
        System.out.println(compCoordinate(p, q) ? "p와 q는 같습니다." : "p와 q는 같지않습니다.7.5");
    }
}
