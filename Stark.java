package WeeklyChallenge_4.Mr;



public class Stark {
    public static double sol(double x,double y,double z) {
        if (x > y) {
            double PA, AB, BM = 0;
            PA = y / 5;
            AB = y / 3;
            BM = z - PA - AB;
            x = x - 2 * y;
            double ans = Math.abs(x - BM);
            return ans;
        }
        return x - z > 0 ? x - z : 0;
    }
    public static void main(String[] args)
    {
        System.out.print((int)sol(3000,1000,1000) + sol(200,100,125) + sol(500,1000,100)+ sol(25000,10000,12000));
    }

}

