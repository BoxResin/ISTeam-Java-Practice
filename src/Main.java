import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int x1, x2, y1, y2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("x1 y1 좌표 입력: ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.print("x1 y1 좌표 입력: ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.println("거리: " + Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)));
    }
}
