import java.util.Scanner;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        String str = "3 62";
        Scanner scanner = new Scanner(str);
        int iNum1, iNum2;
        int iSum =0;

        iNum1 = scanner.nextInt();
        iNum2 = scanner.nextInt();

        for(int i= iNum1; i<=iNum2; ++i){
            iSum += i;
        }
        System.out.print(iSum);

    }
}
