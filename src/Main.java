import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        //예외 처리
        Scanner scanner = new Scanner(System.in);

        //#Case 2: 예외처리 전용 문법을 사용한 예외처리 방법
        try
        {
            //실행할 코드를 쭉 적는다.
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("결과 " + result);

        } catch (InputMismatchException e)
        {
            System.out.println("숫자를 입력해주세요.");
        } catch (ArithmeticException e)
        {
            //각 exception 안에서도 각각의 상황의 따른 필터링이 필요함
            if (e.getMessage().equals("by zero"))
                System.out.println("숫자를 0으로 나눴습니다.");
            e.printStackTrace();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
