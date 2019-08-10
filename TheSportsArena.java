/*      Marble 1
        Large Marble 2
        Bouncing ball 4
        Special bouncing ball 8
        Rubber ball	16
        Tennis ball 32
        Season ball	64
        Beach ball	128
        Volley ball 256
        Basket ball 512
        Foot ball	1024
        Special edition Foot ball 2048
*/
import java.lang.Math;
import java.util.Scanner;

public class TheSportsArena
{
    int money, i;

    TheSportsArena(int money)
    {
        this.money=money;
    }
    int leastItem()
    {
        int ans=0;
        for(int i=11;i>=0;i--)
        {
            while(money>=Math.pow(2,i))
            {
                ans++;
                money-=Math.pow(2,i);
            }
        }
        return ans;
    }
    public static void main(String args[])
    {   System.out.println("Enter Money: ");
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        TheSportsArena i=new TheSportsArena(m);
        System.out.println(i.leastItem());
    }
}