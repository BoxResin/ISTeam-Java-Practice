import java.util.Scanner;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int iNum = scanner.nextInt();
        for(int i=0; i< iNum; ++i){
            for(int j=0; j!=i+1; ++j){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
