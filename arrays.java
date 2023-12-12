// Array Operations in java

public class arrays {
    public static void main(String args[])
    {
        int a[] = new int[10];
        System.out.println("Array before adding any data:");
        System.out.print("[");

        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]+" ");
        }
        System.out.print("]\n");
        System.out.println("Array after adding elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=2*i;
            System.out.println("Adding "+2*i +" to position "+i);
        }

        System.out.print("[");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i] +" ");
        }
        System.out.print("]\n");

        //Search by index
        int searchindex = 4;
        System.out.println("Element at index "+searchindex+" is "+ a[searchindex]);

        //Search by value
        int searchvalue = 6;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==searchvalue)
            {
                System.out.println("Element "+ searchvalue+" found at index "+ i);
            }
        }

        //Updating index
        int update = 5;
        System.out.println("Element at index 5 changed to "+ update);
        a[update] = 5;
        
        System.out.println("Final value of array A is: ");
        System.out.print("[");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i] +" ");
        }
        System.out.print("]\n");
    }
    
}