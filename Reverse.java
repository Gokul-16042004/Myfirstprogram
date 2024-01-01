import java.util.Arrays;


public class Reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //output:{5,4,6,10,44};
        int i,j,c=0;
       /*  for(i=0,j=arr.length-1;i<j;i++,j--)
        {
                c=arr[i];
                arr[i]=arr[j];
                arr[j]=c;
        }
        */
        i=0;
        j=arr.length-1;
        while(i<j)
        {
               c=arr[i];
                arr[i]=arr[j];
                arr[j]=c;
                i++;
                j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
       // System.out.println(Arrays.toString(arr));
    }
}

