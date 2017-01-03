import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int answer = ((int) (Math.random() * 100 + 1));
        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정답: " + answer);
        System.out.print("입력: ");
        input = scanner.nextInt();

        while(answer != input)
        {
            if(input > answer)
                System.out.println("높습니다.");
            else
                System.out.println("낮습니다.");

            System.out.print("입력: ");
            input = scanner.nextInt();
        }

        System.out.println("정답입니다!");
    }
}
