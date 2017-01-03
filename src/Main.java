import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n1, n2, sum = 0;
        String str = "3 62";
        Scanner scanner = new Scanner(str);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        for(int i = n1; i <= n2; i++)
            sum += i;

        System.out.println("합계: " + sum);
    }
}
