import java.util.*;

class Searching
{
    public void Change(int Arr[] ) 
    {   
         for (int i = 0; i < Arr.length; i++) 
         {
             Arr[i]++;
         }
    }
}

class pgm256
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter element :");;
        for (int i = 0; i < Arr.length; i++) 
        {
            Arr[i] = sobj.nextInt();
        }

        Searching obj = new Searching();

        obj.Change(Arr);

        System.out.println("Data after function call");
        for (int i = 0; i < Arr.length; i++) 
        {
            System.out.println(Arr[i]);             
        }
    }
}
    
