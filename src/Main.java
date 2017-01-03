import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList <Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int iNum;
        int iOption;
        int iSum = 0;

        while (true)
        {
            System.out.println("[메뉴]");
            System.out.println("1. 숫자 추가");
            System.out.println("2. 숫자 제거");
            System.out.println("3. 합계 구하기");
            System.out.println("4. 끝내기");
            System.out.print("명령 입력: ");

            iOption = scanner.nextInt();

            switch (iOption)
            {
                case 1:
                    System.out.print("숫자 입력: ");
                    iNum = scanner.nextInt();
                    array.add(iNum);
                    break;
                case 2:
                    System.out.print("삭제할 숫자 위치 입력: ");
                    iNum = scanner.nextInt();
                    if(iNum < array.size())
                    {
                        array.remove(iNum);
                    }
                    else{
                        System.out.println("ERROR");
                    }
                    break;
                case 3:
                    for(int i=0; i<array.size(); ++i){
                        iSum += array.get(i);
                    }
                    System.out.printf("합계: %d\n", iSum);
                    iSum = 0;
                    break;
                case 4:
                    exit(1);

            }

        }
    }


}
