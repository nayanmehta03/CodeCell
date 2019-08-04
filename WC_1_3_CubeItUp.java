import java.util.Scanner;

public class WC_1_3_CubeItUp {
    static long cubeIt(long n)
    {
        long res=0;
        if(n%3==0)
        {
         res=18*(n/3);
        }
        else if(n%3==1)
        {
            res=18*(n/3)+1;
        }
        else if(n%3==2)
        {
            res=18*(n/3)+9;
        }
        return res;
    }
    public static void main(String[] args)
    {
        long n;
        System.out.printf("Enter limit: ");
        Scanner s=new Scanner(System.in);
        n=s.nextLong();
        long res=cubeIt(n);
        res=res%1000007;
        System.out.printf("Answer: "+res);
    }

}
