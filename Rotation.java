import java.util.Arrays;
public class Rotation {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k,i,j,c,n=4;
        for(k=1;k<=3;k++)
        {
            c=a[0];
            for(i=0,j=1;i<=3;i++,j++)
            {
                a[i]=a[j];    
            }
            a[n]=c;
        }
        System.out.println(Arrays.toString(a));
    }
}
