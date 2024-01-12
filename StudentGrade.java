public class StudentGrade {
    public static void main(String[] args) {
        int i,sum=0;
        int array[]={100,35,45,67,89};
        for(i=0;i<5;i++)
    {
        if(array[i]<35)
        {
            System.out.println("fail");
            System.exit(0);
        }
        else
        {
            sum=sum+array[i];
        }
    }
    double average=(double)sum/5;
    System.out.println(average); 
}
}
