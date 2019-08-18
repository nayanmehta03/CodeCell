


  public class WC_3_2_WirePieces {
    public static void main(String args[]) {
        System.out.println(maxPieces(10,5,2,3)+maxPieces(16,7,5,3)+maxPieces(10000,19,35,37)+maxPieces(2501,8,4,6)+maxPieces(10520,217,88,129)+maxPieces(300001,263,311,179));
    }
    public static int maxPieces(int n,int x,int y,int z){
        Integer[] values = new Integer[3];
        values[0] = x;
        values[1] = y;
        values[2] = z;
        int store[]=new int[n+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=0; j<3; j++)
            {
                if(i== values[j])
                    store[i]=Math.max(1,store[i]);
                else if(i>values[j])
                {
                    if(store[i-values[j]]>0)
                        store[i]=Math.max(store[i-values[j]]+1,store[i]);
                }
                else
                {
                  if(store[i] == 0)
                    store[i]=-1;
                }
            }
        }
        return store[n];
    }
}

