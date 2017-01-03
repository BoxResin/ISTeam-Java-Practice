import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int s_s = 0, s_f;
        char c;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++)
        {
            c = str.charAt(i);
            if (c == ' ')
            {
                s_f = i;
                if(str.charAt(i-1)!=' ')
                System.out.println(str.substring(s_s, s_f));
                s_s = s_f + 1;
            }
        }
        System.out.println(str.substring(s_s, str.length()));
    }
}