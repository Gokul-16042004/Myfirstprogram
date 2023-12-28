import java.util.Scanner;

public class Fibonachii {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=inp.nextInt();
        if(n==0)
        System.out.println(0);
        else if(n==1 || n==2)
            System.out.println(1);
        else{
            int f=0,s=1,t=0;
            for(int i=2;i<n;i++)
            {   
                t=f+s;
                f=s;               
                s=t;
            }
            System.out.println(t);
        }
}
}