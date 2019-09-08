package WeeklyChallenge_5;

import java.util.Collections;

import java.util.Vector;

public class TruthORLie {
    static Integer y[] = {16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3,16
    };
    static Integer b[] = {14, 10, 17, 13, 4, 8, 6, 7, 13, 13, 17, 18, 8, 17, 2, 14, 6, 4, 7,12
    };
    static Integer c[] = {15, 18, 6, 13, 12, 4, 4, 14, 1, 6, 18, 2, 6, 16, 0, 9, 10, 7, 12, 3
    };
    static Integer d[] = {6, 0, 10, 10, 10, 5, 8, 3, 0, 14, 16, 2, 13, 1, 2, 13, 6, 15, 5, 1
    };

    public static int deduction(Integer[] a)
    {
        int c =0,max = 0;
        for(int i =0; i<a.length ; i++)
            if(a[i]>max)
                max = a[i];
        int x = a.length - max;
        for (int i =0; i<a.length ;i++)
            if(a[i]<x)
                c++;
        if (x > c)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(deduction(d));

    }
}
