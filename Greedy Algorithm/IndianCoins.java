
import java.util.*;


public class IndianCoins {

public static void main(String[] args) {
    Integer coins[] = {2000, 500,100,50,20,10,5,2,1};

    Arrays.sort(coins,Comparator.reverseOrder());

    int countCoins = 0;

    int amount = 5900;

    ArrayList<Integer> ans = new ArrayList<>();

    for(int i = 0; i<coins.length; i++)
    {
        if(coins[i] <= amount)
        {
            while(coins[i] <= amount)
            {
                countCoins++;
                ans.add(coins[i]);
                amount = amount - coins[i];
            }
        } 
    }

    System.out.println("Max no of Coins is used: "+countCoins);

    for(int  i=0; i<ans.size(); i++)
    {
        System.out.print(ans.get(i)+" ");
    }

}
    
}
