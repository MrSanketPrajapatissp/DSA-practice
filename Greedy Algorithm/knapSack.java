
import java.util.Arrays;
import java.util.Comparator;

public class knapSack {

    public static void main(String[] args) {
        int val[] = {60,100,120};
        int Weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        for(int i = 0; i<val.length; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) Weight[i];
        }


        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalValue = 0;
        for(int i = ratio.length -1; i>= 0; i--)
        {
            int idx = (int)ratio[i][0];

            if(capacity >= Weight[idx])
            {
                finalValue += val[idx];
                capacity  = capacity - Weight[idx]; 
            }else{
                finalValue += (ratio[i][1]*capacity);
                capacity = 0;
                break; 
            }


        }

        System.out.println("Final Value: "+finalValue);
    }
    
}
