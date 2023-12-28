import java.util.Arrays;
import java.util.Scanner;
public class Helloworld{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int arr[]=new int[5];  
        for(int i=0;i<5;i++)
        {
            arr[i]=inp.nextInt();
        }
        int min=arr[0],max=arr[0];
        for(int i=0;i<5;i++)
        {
           if(arr[i]<min)
           {
            min=arr[i];
           }
           if(arr[i]>max)
           {
            max=arr[i];
           }
        }
        System.out.println("minimum:"+min+" maximum"+max);
        
    }
}