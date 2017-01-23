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

/*        // str에 "Hello"가 정확히 입력되어야 한다고 가정
        String str = scanner.next();

        //#Case 1: if문을 사용한 예외처리 방법
        //정상 입력일 때 동작
       if (str.equals("Hello"))
        {

        }
        //비정상 입력일 때 동작
        else
        {
            System.out.println("Hello를 입력하세요");
        }
*/
        //#Case 2: 예외처리 전용 문법을 사용한 예외처리 방법
        try
        {
            //실행할 코드를 쭉 적는다.
            int number = scanner.nextInt();

            throw new FileNotFoundException();
        } catch (InputMismatchException e)
        {
            System.out.println("입력 관련 예외");
            e.printStackTrace();
        } catch (FileNotFoundException e)
        {
            System.out.println("파일 찾을 수 없음 예외");
            e.printStackTrace();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
