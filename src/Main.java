import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int s_s = 0, s_f;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for(int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                s_f = i;
                System.out.println(str.substring(s_s,s_f));
                s_s = s_f+1;
                i++;
            }
        }
        System.out.println(str.substring(s_s,str.length()));
    }
}