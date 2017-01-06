import yoonseong.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList array = new ArrayList();
        printArray(array);
        array.add(20);
        array.add(214);
        array.add(125);
        array.add(2);
        array.add(2214);
        array.add(221);
        array.add(14);
        printArray(array);
        array.remove(4);
        printArray(array);
        System.out.println("현재 크기 : " + array.size());
        array.set(2, 2798);
        printArray(array);
    }

    public static void printArray(ArrayList array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i));
        }
        System.out.println();
    }
}
