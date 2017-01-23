/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        //Thread문에서 발생하는 오류는 반드시  try, catch문으로 잡아줘야 함
        try
        {
            Thread.sleep(3000); //프로그램이 3초간 멈춤
        } catch (InterruptedException e)    //반드시 호출해야하는 오류
        {
            e.printStackTrace();
        }

    }


}
