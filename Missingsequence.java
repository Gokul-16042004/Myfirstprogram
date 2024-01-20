public class Missingsequence {
    public static void main(String[] args) {
        int arr[]={1,5,7,9,11};
        int max=arr[0],min=arr[0],sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
            sum+=arr[i];
        }
        double avg=(double)(min+max)/2.0;
        int total=(int)(avg*(arr.length+1));
        System.out.println("Missing Number:"+(total-sum));
    }
}
