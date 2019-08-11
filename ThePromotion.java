import java.util.Scanner;
import java.lang.Math;

public class ThePromotion
{
    public static int solution(String s,int n)
    {

        String numbers[]=s.split(" ");
        Integer[]  values=new Integer[n];
        for(int i=0;i<n;i++)
        {
            values[i]=Integer.parseInt(numbers[i]);
        }
        String[] groupSet=new String[n*(n-1)/2];
        for(int i=0,k=0;i<n-1;i++)
        {
            for (int j = i + 1; j < n; j++)
            {
               groupSet[k]=values[i]+" "+values[j];
               k++;
            }
        }
        int sum=0;
        for(int i=0;i<groupSet.length;i++)
        {
           sum+=and(groupSet[i]);
        }


        return sum%101;
    }
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static Integer[] decimalToBinary(int n)
    {
        Integer[] binRev=new Integer[8];
        for(int i=0;i<8;i++)
            binRev[i]=0;
        Integer[] bin=new Integer[8];
        for(int i=0;i<8;i++)
            bin[i]=0;
        int i=0;
        while(n > 0)
        {
            int a=n%2;
            binRev[i]=a;
            i++;
            n = n / 2;
        }
        for(i=0;i<8;i++)
            bin[i]=binRev[7-i];

        return bin;
    }

    public static double binaryToDecimal(Integer[] a)
    {
        double decimal=0;
        for(int i=7;i>=0;i--)
        {
            decimal+=a[i]*Math.pow(2,7-i);
        }
        return decimal;
    }

    public static int and(String s)
    {
        String[] n= s.split(" ");
        Integer[] a=decimalToBinary(Integer.parseInt(n[0]));
        Integer[] b=decimalToBinary(Integer.parseInt(n[1]));
        Integer[] and=new Integer[8];
        for(int i=0;i<8;i++)
        {
            if(a[i]==1&&b[i]==1)
            {
                and[i]=1;
            }
            else and[i]=0;
        }
        return (int)binaryToDecimal(and);
    }


    public static void main(String args[])
    {
        System.out.println("Enter Input: ");
        Scanner s=new Scanner(System.in);
        String[] input = new String[2];
        for (int i = 0; i < 2; i++)
        {
            input[i] = s.nextLine();
        }
        int count=Integer.parseInt(input[0]);
        System.out.println( solution(input[1],count));



    }
}
