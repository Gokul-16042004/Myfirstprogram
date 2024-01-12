public class Function {
    public static void main(String[] args) {
        add1();
        add2(10,20);
        System.out.println(add3());
        System.out.println(add4(10,20));
    }
    public static void add1()
    {
        int num1=10;
        int num2=20;
        System.out.println(num1+num2);
    }
    public static void add2(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
    public static int add3()
    {
        int num1=10;
        int num2=20;
        return num1+num2;
    }
    public static int add4(int num1,int num2)
    {
        return num1+num2;
    }
}
