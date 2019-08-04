import java.util.Scanner;

public class WC_0_0_PracticeTest {
    static long sum(int n)
    {
        long sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int n;
        long sum;
        System.out.println("Enter limit n: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        sum=sum(n);
        System.out.println("Sum of first "+n+" natural number is "+sum);

    }
}
