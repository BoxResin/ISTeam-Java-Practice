package Hyejun;

public class ArrayList
{
    private int size = 0;
    private int[] array = new int[1];

    public void add(int data)
    {

        if (size == array.length)
        {
            int[] array2 = new int[array.length * 2];

            for(int i = 0; i < size; i++)
                array2[i] = array[i];

            array = array2;
        }
        array[size] = data;
        size++;

    }

    public void remove(int num)
    {
        for (int i = num; i < size; i++)
            array[i] = array[i + 1];
        size--;
    }

    public int size()
    {
        return size;
    }

    public int get(int num)
    {
        return array[num];
    }

    public void set(int num, int data)
    {
        array[num] = data;
    }
}
