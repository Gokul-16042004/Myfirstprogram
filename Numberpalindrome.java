public class Numberpalindrome
{
    public static void main(String[] args) {
        int n=1991;
        int copy=n;
        int div=0,ans=0;
        while(copy>0)
        {
            div=copy%10;
            ans=ans*10+div;
            copy=copy/10;
        }
        if(n==ans)
        {
            System.out.println("its  a palindrome");
        }
        else{

            System.out.println("its not a palindrome");
        }
    }
    
}