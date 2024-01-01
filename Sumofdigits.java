public class Sumofdigits {
    public static void main(String[] args) {
        int n=1234;
        int div=0,sum=0;
        // for(i=1;i<=6;i++)
        // {
        //     div=n%10;
        //     sum=sum+div;
        //     n=n/10;
        // }
        while(n>0)
        {
            div=n%10;
            sum+=div;
            n=n/10;
        }
        // for(;n>0;n/=10)
        // {
        //     div=n%10;
        //     sum+=div;
        // }
        //System.out.println("sum of digits="+sum);
    }
}
