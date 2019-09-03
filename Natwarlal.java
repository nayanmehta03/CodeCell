package WeeklyChallenge_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Stream;

public class Natwarlal {
    static int[] A = Stream.of("6,5,4,3,2,1".split(",")).mapToInt(Integer::parseInt).toArray();
    static int[] B = Stream.of("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21".split(",")).mapToInt(Integer::parseInt).toArray();
    static int[] C = Stream.of("300,2,2,5,80,20,11,222,34,56,77,80,19,222,215,20,88,210,97,99,1000,1100,2500,212,290,111,122,133,700,712,850,90,0,20,25,35,50,70,222,1555,222,700,300,712,850,11,90,7,2,5,0,20,25,35,50,70,222,122".split(",")).mapToInt(Integer::parseInt).toArray();
    static int[] D = Stream.of("111,1111,112,12,13,1,445,1000,2112,1221,90,80,5,7,8,9,190,200,212,567,777,899,123,22,45,77,8,9,10,233,221,34,222,190,80,70,35,32,12,0".split(",")).mapToInt(Integer::parseInt).toArray();

    int money = 0;

    public void give(Vector<Integer> pile) throws ArrayStoreException
    {
        Integer[] p = new Integer[pile.size()];
        p = pile.toArray(p);
        if(p[0]>p[p.length-1]) {
            money += pile.get(0);
            pile.remove(0);
        }
        else
        {
            money += pile.get(pile.size()-1);
            pile.remove(pile.size()-1);
        }

    }

    public static int play(int[] pass)
    {
        Vector<Integer> pile =new Vector();
        for(int i = 0; i<pass.length; i++ )
            pile.add(pass[i]);
        Natwarlal x = new Natwarlal();
        Natwarlal y = new Natwarlal();

        boolean natwarlalChance = true;

        while (pile.size()!=0)
        {
            if(natwarlalChance)
            {
                x.give(pile);
                natwarlalChance = false;
            }
            else {
                y.give(pile);
                natwarlalChance =true;
            }
        }
        if(x.money>y.money)
            return x.money+y.money;
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(play(A)+play(B)+play(C)+play(D));
    }
}
