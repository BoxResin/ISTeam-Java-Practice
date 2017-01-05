import java.util.Scanner;

public class WordChanger
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String origin, reword;

        System.out.print("문자열 입력: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        System.out.print("찾기: ");
        origin = scanner.next();
        System.out.print("바꾸기: ");
        reword = scanner.next();

        for(i = 0; i < words.length; i++)
        {
            if (words[i].equals(origin))
            {
                words[i] = reword;
            }
        }

        System.out.print("결과: ");
        for(i = 0; i < words.length; i++)
            System.out.print(words[i] + " ");
    }
}
