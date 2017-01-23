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
            String str = scanner.next();
            if (!str.equals("Hello"))
                //throw <Exception 타입의 객체>
                //try 블록 내에서 이 코드가 실행되는 순간 catch 블록 안으로 점프함
                //catch문에 한 번 빠지면 다시 try문으로 돌아갈 수 없다
                throw new Exception();
        }
        catch (Exception e)
        {
            //예외가 발생했을 때 실행할 코드
            System.out.println("Hello를 입력하세요.");
        }
    }


}
