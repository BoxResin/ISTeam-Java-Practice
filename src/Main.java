/**
 * Created by HyeRyeong on 2016-12-30.
 */
public class Main
{
    public static void main(String[] args)
    {
        Printable printable = new Child();
        func(printable);
    }

    public static void func(Printable printable)
    {
        printable.print();
    }


}
