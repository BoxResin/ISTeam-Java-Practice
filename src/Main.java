import java.util.Scanner;

public class Main
{
	/**
	 * 찾아 바꾸기 모범 답안
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.printf("문자열 입력: ");
		String input = scanner.nextLine();

		System.out.printf("찾기: ");
		String find = scanner.nextLine();

		System.out.printf("바꾸기: ");
		String change = scanner.nextLine();

		System.out.printf("결과: ");
		System.out.println(input.replace(find, change));
	}
}