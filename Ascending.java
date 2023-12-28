import java.util.Arrays;
public class Ascending {
    public static void main(String[] args) {
        int arr[]={3,2,5,1,1,6,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
