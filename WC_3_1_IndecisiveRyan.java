/*  input = { {13 45 3} , {1 123456 13} , {123 456789 189} , {1 2000000 23047885} }

    output = { 17 , 9675 , 21841 , 2998 }

 */
import java.util.Scanner;

public class WC_3_1_IndecisiveRyan {
    public  static int magical(String s)
    {

        String[] string = s.split(" ");
        int[] input = new int[string.length];
        for(int i = 0 ; i<string.length ; i++)
            input[i] = Integer.parseInt(string[i]);
        int[] magicDays = new int[input[1]];
        int k=0;
        for(int i=input[0];i<=input[1];i++)
        {
           if(magicDetection(i,input[2]))
           {
               magicDays[k++] = i;
           }
        }

        return k;
    }

    public static boolean magicDetection(int i , int p)
    {
        int temp = i;
        int reversed=0;
        while(temp != 0)
        {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if((Math.abs(reversed-i))%p == 0)
            return true;
        return false;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter input: ");
        Scanner s=new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Number of magical days: "+magical(input));
    }
}
