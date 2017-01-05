import Hyejun.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList array = new ArrayList();

        array.add(9);

        System.out.print("배열 상태: ");
        for(int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");
        System.out.println("\n" + array.size() + "\n");

        array.add(7);

        System.out.print("배열 상태: ");
        for(int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");
        System.out.println("\n" + array.size() + "\n");

        array.add(10);

        System.out.print("배열 상태: ");
        for(int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");
        System.out.println("\n" + array.size() + "\n");

        array.remove(1);

        System.out.print("배열 상태: ");
        for(int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");
        System.out.println("\n" + array.size() + "\n");

        array.set(0, 3);

        System.out.print("배열 상태: ");
        for(int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");
        System.out.println("\n" + array.size() + "\n");

        array.set(1,77);

        System.out.print("배열 상태: ");
        for(int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");
        System.out.println("\n" + array.size() + "\n");
    }

}
