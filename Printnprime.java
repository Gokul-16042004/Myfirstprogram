import java.util.Scanner;

public class Printnprime {
    public static void main(String[] args) {
        int i,j,count=0;
       Scanner input=new Scanner(System.in);
    System.out.println("enter the limit");
       int n=input.nextInt();
       for(i=1;i<=n;i++)
        {
            count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i);   
            }   
        }
    }
}
