package WeeklyChallenge_4;

public class Stark
{
        public static void main(String[] args)
        {
            double average=(weaponsDel(500,1000,100)+weaponsDel(200,100,125)+weaponsDel(3000,1000,1000)+weaponsDel(25000,10000,12000)+weaponsDel(12345,2120,1111))/5.0;
            System.out.println(average);
        }
        public static int weaponsDel(int X, int Y, int Z)
        {
            int maxDistance=Math.round(X/Y);
            int sum=0;
            for(int i=1;i<=maxDistance;i++){
                sum+=Math.round(Y/(2*i-1));
            }
            sum+=Math.round((X%Y)/(2*maxDistance+1));
            return sum-Z+1;
        }
}
