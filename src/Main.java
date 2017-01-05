import java.util.Scanner;

public class Main
{
	/**
	 * 소문자 전환 모범 답안
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.printf("입력: ");
		String input = scanner.nextLine();

		System.out.printf("결과: ");
		System.out.println(input.toLowerCase());
	}
}