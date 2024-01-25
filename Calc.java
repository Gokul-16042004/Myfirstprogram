public class Calc {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.setdata(20, 3);
        System.out.println(c1.add());
        System.out.println(c1.sub());
        System.out.println(c1.div());
        System.out.println(c1.mul());
        Calculator c2=new Calculator();
        c2.setdata(1,2);
        System.out.println(c2.mul());
    }
}
class Calculator
{
    int num1;
    int num2;
    public int add()
    {
        int sum=num1+num2;
        return sum;
    }
    public int sub()
    {
        int sub=num1-num2;
        return sub; 
    }
    public int mul()
    {
        int mul=num1*num2;
        return mul;
    }
    public void setdata(int a,int b)
    {
        num1=a;
        num2=b;
    }
    public double div()
    {

        double div=(double)num1/(double)num2;
        return div;
    }
}
