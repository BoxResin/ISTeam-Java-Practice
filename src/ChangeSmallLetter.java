import java.util.Scanner;

public class ChangeSmallLetter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.print("입력: ");
        String input = scanner.nextLine();
        char[] words = new char[input.length()];

        for (i = 0; i < input.length(); i++)
            if (input.charAt(i) <= 'Z' && input.charAt(i) >= 'A')
                words[i] = (char)(input.charAt(i) + 32);
            else
                words[i] = input.charAt(i);

        System.out.println(words);
    }

}
