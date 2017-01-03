import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        int rand = ((int) ((Math.random() * 100) + 1));
        Scanner scanner = new Scanner(System.in);
        int iNum;


        while(true){
            iNum = scanner.nextInt();
            if(iNum == rand){
                System.out.println("정답입니다!");
                exit(1);
            }
            else if(iNum > rand){
                System.out.println("높습니다.");
            }
            else{
                System.out.println("낮습니다.");
            }
        }

    }
}
