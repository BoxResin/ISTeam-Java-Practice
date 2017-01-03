import java.util.Scanner;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i)!=' ')
            {
                System.out.printf("%c", str.charAt(i));
            }
            else{
                System.out.print('\n');
            }
        }

    }
}
