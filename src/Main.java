import java.awt.print.Printable;
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

        // str에 "Hello"가 정확히 입력되어야 한다고 가정
        String str = scanner.next();

        //정상 입력일 때 동작
        if(str.equals("Hello")){

        }

        //비정상 입력일 때 동작
        else{
            System.out.println("Hello를 입력하세요.");
        }
    }

    public static void func(Printable printable)
    {
        printable.print();
    }


}
