import java.util.Scanner;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;

        System.out.print("x1, y1 좌표 입력: ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.print("x2, y2 좌표 입력: ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.printf("거리: %f", Math.sqrt(((x1-x2)*(x1-x2))- ((y1-y2)*(y1-y2))));

    }
}
