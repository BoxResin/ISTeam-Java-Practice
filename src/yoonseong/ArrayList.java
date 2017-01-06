package yoonseong;

public class ArrayList
{
    private int[] array = new int[16];
    private int size = 0;

    /**
     * 배열의 마지막에 값을 추가하는 메소드
     * @param data 넣어줄 값
     */
    public void add(int data)
    {
        if (size >= array.length)
        {
            int[] array2 = new int[array.length * 2];
            for (int i = 0; i < array.length; i++)
            {
                array2[i] = array[i];
            }
            array = array2;
        }
        array[size] = data;
        size++;
    }

    /***
     * 배열의 index번째에 있는 값을 삭제하고 땡겨주는 method
     * @param index 삭제할 위치
     */
    public void remove(int index)
    {
        for (int i = index; i < size - 1; i++)
        {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int size()
    {
        return size;
    }

    public int get(int index)
    {
        return array[index];
    }

    public void set(int index, int data)
    {
        array[index] = data;
    }
}
