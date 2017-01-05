import java.util.ArrayList;
import java.util.Scanner;

public class CombineString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayString = new ArrayList<>();
        String input;

        while(!(input = scanner.next()).equals("-1"))
        {
            arrayString.add(input);
        }

        System.out.println("결과: ");

        for(int i = 0 ; i < arrayString.size(); i++)
            System.out.print(arrayString.get(i) + " ");
    }
}
