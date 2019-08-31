package WeeklyChallenge_5;

public class Alien {
    public static int computeShots(int x,int y){
        int shots = 0;
        while (x!=0 | y!=0) {
            if (x == y){
                shots+=x;
                break;
            }
            else if((x%2==0 || x==1)&&(y%2==0)){
                x = x*2;
                shots +=1;
            }
            else{
                x-=1;
                y-=1;
                shots+=1;
            }
        }
        return shots;
    }
    public static void main(String[] args){
        System.out.println(computeShots(2,9)+computeShots(13,14));
    }
}
