import java.util.Scanner;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        //스레드 : 동시에 여러 코드를 실행하는 것.

        //익명 클래스로 오버라이딩해줘야 함 (customizing 가능)
        Thread thread = new Thread(){
            @Override
            public void run(){
                //실행할 코드
                try
                {
                    for (int i = 0; i < 10; ++i)
                    {
                        System.out.println(i + "번째");
                        sleep(1000);
                    }
                }
                catch (InterruptedException e){

                }
            }
        };
        thread.start(); //스레드 실행 -> 반드시 start로 호출해야 함

        Scanner scan= new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int number = scan.nextInt();
        System.out.println("number * number = " + number * number);
    }
}
