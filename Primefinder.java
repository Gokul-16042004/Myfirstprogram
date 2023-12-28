import java.util.Scanner;
public class Primefinder {
public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
    int helper=0;
    System.out.println("enter value:");
    int n=input.nextInt();
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
             helper++;
        }  
    }
    if(helper==2)
    {
        System.out.println("Its prime");
    }
    else{
        System.out.println("Its not prime");
    }
}
}