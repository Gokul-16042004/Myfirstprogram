public class Inhritance {
    public static void main(String[] args) 
    {
        Calculator cc=new Calculator();
        System.out.println(cc.add(1,2));
    }
}
class Calculator
{
    String add(String s1,String s2)
    {
        return s1+s2;
    }
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}


