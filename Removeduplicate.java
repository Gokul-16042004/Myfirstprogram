public class Removeduplicate {
public static void main(String[] args) {
    int i,j;
    int a[]={10,20,30,10,20,10};
    for(i=0;i<a.length;i++)
    {
        for(j=i+1;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                a[j]=0;
            }
        }
    }
    for (int k = 0; k < a.length; k++) 
    {
        if(a[k]!=0)
        {
        System.out.println(a[k]);
        }
    }

}
}
