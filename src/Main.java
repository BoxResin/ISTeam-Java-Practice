import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            input();
        } catch (InputMismatchException e)
        {
            e.printStackTrace();
        } catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

    }

    public static void input() throws InputMismatchException, ArithmeticException
    {
        //예외 처리
        Scanner scanner = new Scanner(System.in);

        //실행할 코드를 쭉 적는다
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a / b;
        System.out.println("결과: " + result);
    }
}
