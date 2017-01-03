import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int menu = 0, num;
        ArrayList<Integer> arrayInt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n[메뉴]");
            System.out.println("1. 숫자 추가");
            System.out.println("2. 숫자 제거");
            System.out.println("3. 합계 구하기");
            System.out.println("4. 끝내기");
            System.out.print("명령 입력: ");
            menu = scanner.nextInt();

            if (menu == 1)
            {
                System.out.print("\n숫자 입력: ");
                num = scanner.nextInt();
                arrayInt.add(num);
            } else if (menu == 2)
            {
                System.out.print("\n삭제할 숫자 위치 입력: ");
                num = scanner.nextInt();
                if (num < arrayInt.size())
                    arrayInt.remove(num);
                else
                    System.out.println("해당 위치에 숫자가 없습니다.");
            } else if (menu == 3)
            {
                int sum = 0;
                for (int i = 0; i < arrayInt.size(); i++)
                    sum += arrayInt.get(i);

                System.out.println("\n합계: " + sum);
            } else if (menu == 4)
                break;
            else
                System.out.println("\n잘못된 메뉴 입력입니다.");

        }
        System.out.println("\n프로그램을 종료합니다.");

    }

}
