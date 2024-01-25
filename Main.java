import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Student s1=new Student();
        Student s2=new Student();
        int[] marks={90,91,22,55,12};
        s1.setData(123,"arun",marks);
        s1.display();
        int[] marks2={100,100,20,200,10};
        s2.setData(456,"gokul",marks2);
        s2.display();
        System.out.println(s1.getTotal()+" "+s2.getTotal());
    }
}
class Student
{
    int rollNo;
    String name;
    int marks[]=new int[5];
   public void setData(int n,String s,int[] mark)
   {
        rollNo=n;
        name=s;
        marks=mark;
   }
   public void display()
   {
    System.out.println(rollNo+" "+name);
   }
   public int getTotal()
   {
     int sum=0;
     for (int i = 0; i < marks.length; i++) 
     {
        sum+=marks[i];
     }
     return sum;
   }
}
