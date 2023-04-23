package Chapter_07;
import java.util.Scanner;
public class MaxOfHeightWeight {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("인원수는? ");
        int people = stdIn.nextInt();

        int[] height = new int[people];
        int[] weight = new int[people];

        System.out.println(people + "키와 체중을 입력하세요.");

        for (int i = 0; i < people; i++) {
            System.out.print((i + 1) + "번의 신장: ");
            height[i] = stdIn.nextInt();
            System.out.print((i + 1) + "번의 체중: ");
            weight[i] = stdIn.nextInt();
        }

        System.out.println("가장 키가 큰 사람의 신장 " + maxOf(height) + "cm");
        System.out.println("가장 체중이 무거운 사람의 체중 " + maxOf(weight) + "kg");
    }
}
