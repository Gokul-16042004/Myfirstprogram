public class Pattern {
    public static void main(String[] args) {
        pattern5v2(10);
    }
    public static void pattern1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
    public static void pattern3(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n)
      {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
      }  
    public static void pattern5(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5v2(int n)
    {
        for(int row=1;row<n*2;row++)
        {
            int spaceLimit=row<n?n-row:row-n;
            int starLimit=row<n?row:n-(row%n);
            for(int col=1;col<=spaceLimit;col++)
            {
                System.out.print("  ");
            }
            for(int col=1;col<=starLimit;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


