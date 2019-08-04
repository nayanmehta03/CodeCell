import com.sun.xml.internal.bind.util.Which;

import java.util.Scanner;

public class WC_1_1_WhichDate {
    static int WhichDay(int d, int m,long y)
    {
        long days=0;
        days=365*(y-1)+31*(m-1)+d;
        if(days%7==1)
            return 1;
        else if(days%7==2)
            return 2;
        else if(days%7==3)
            return 3;
        else if(days%7==4)
            return 4;
        else if(days%7==5)
            return 5;
        else if(days%7==6)
            return 6;
        else return 7;

    }
    public static void main(String[] args)
    {
        String date;
        System.out.println("Date: ");
        Scanner s=new Scanner(System.in);
        date=s.next();
        String[] dateSplit= date.split("/");
        int d=Integer.parseInt(dateSplit[0]);
        int m=Integer.parseInt(dateSplit[1]);
        long y=Long.parseLong(dateSplit[2]);
        int n= WhichDay(d,m,y);
        switch (n)
        {
            case 1:
                System.out.println("Day: Monday");break;
            case 2:
                System.out.println("Day: Tuesday");break;
            case 3:
                System.out.println("Day: Wednesday");break;
            case 4:
                System.out.println("Day: Thursday");break;
            case 5:
                System.out.println("Day: Friday");break;
            case 6:
                System.out.println("Day: Saturday");break;
            case 7:
                System.out.println("Day: Sunday");break;

        }
    }
}
