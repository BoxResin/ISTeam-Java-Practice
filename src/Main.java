import java.util.Scanner;

public class Main
{
	/**
	 * 문자열 합치기 모범 답안
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String result = "";

		while (true)
		{
			String input = scanner.nextLine();

			if (input.equals("-1"))
				break;

			result += input;
		}

		System.out.printf("결과: " + result);
	}
}