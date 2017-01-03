import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("x1, y1 좌표 입력: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();

		System.out.print("x2, y2 좌표 입력: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		System.out.println("거리: " + Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
	}
}