

import java.util.*;

abstract class  ArrayX
{
    public int Arr[];

    public ArrayX(int size)
    {
        Arr = new int[size];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the element");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

    }

    public void Display()
    {
        System.out.println("Entered Data is :");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println( Arr[i]);
            
        }
    }
}


public class pgm252 {

    public static void main(String arg [])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sobj.nextInt();

    }
}
