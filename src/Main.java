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
        String [] data = str.split(" ");
        for(int i=0; i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
