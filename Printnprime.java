import java.util.Scanner;

public class Printnprime {
    public static void main(String[] args) {
        int i;
       Scanner input=new Scanner(System.in);
    System.out.println("enter the limit");
       int n=input.nextInt();
       for(i=1;i<=n;i++)
        { 
            if(count(i)==2)
            {
                System.out.println(i);   
            }   
        }
    }
    public static int count(int num)
    {

           int  count=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                {
                    count++;
                }
            }
            return count;
    }
}
