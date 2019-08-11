import java.util.Scanner;

public class WC_2_3_MarbleChallenge {

    static void findStates(int position[])
    {

        position[0] = 0;
        position[1] = 1;
        position[2] = 1;
        position[3] = 0;
        position[4] = 0;
        position[5] = 0;
        position[6] = 1;
        position[7] = 1;
        for (int i = 8; i < 100; i++) {

            if (i % 3 == 0) {
                if (position[i - 1] == 0 || position[i - 2] == 0)
                    position[i] = 1;
                else
                    position[i] = 0;
            }
            if ((i - 1) % 3 == 0) {
                if (position[i - 1] == 0 || position[i - 3] == 0)
                    position[i] = 1;
                else
                    position[i] = 0;
            }
            if ((i - 2) % 3 == 0) {
                if (position[i - 1] == 0 || position[i - 2] == 0 || position[i - 3] == 0)
                    position[i] = 1;
                else
                    position[i] = 0;
            }
        }
    }
    public static void main (String[] args)
    {

        int testCase[]={22,45,26,75};
        int position[]=new int[100];

        findStates(position);
        int sum=0;

        for(int i=0;i<4;i++)
        {
            if(position[testCase[i]]==1)
                sum+=1;
            else if(position[testCase[i]]==0)
                sum+=2;

        }
        System.out.println(sum);
    }
}
