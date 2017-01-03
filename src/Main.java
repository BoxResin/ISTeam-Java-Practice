import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.printf("%f\n", 10F);

        int x = 10;
        if (number < 10 || number > 0)
        {
            for (int i = 1; i < x; i++)
            {
                int result = number * i;
                System.out.printf("%d * %d = %d\n", number, i, result);
            }
        }

    }
}