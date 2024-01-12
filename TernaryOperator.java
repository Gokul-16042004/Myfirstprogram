public class TernaryOperator {
    public static void main(String[] args) {
        int n=4;
        if(n>5)
        {
            System.out.println("its bigger than 5");
        }
        else
        {
            System.out.println("its smaller than 5");
        }
        String s=n>5?"its bigger than 5":"its smaller than 5";
        System.out.println(s);
    }
}
