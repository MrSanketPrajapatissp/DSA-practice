public class Strings1 {
    

    public static void printLetters(String str) {
        
        for(int i = 0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static boolean Palindrome(String str)
    {
        for(int i = 0; i<str.length()/2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            {
                return  false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        String FirstName = "Sanket";
        String LastName = "Prajapati";
        String FullName = FirstName + " " + LastName;

        System.out.println(""+FullName);

        // printLetters(FullName);

        String str1 = "racecar";
        String str2 = "sanket";

        // System.out.println("Is Panlindrome: "+Palindrome(str2));
        // System.out.println("Get shortest path: "+getShortestPath("WNEENESENNN"));
        System.out.println("Get shortest path: "+getShortestPath("NN"));
    }
 

    public static float getShortestPath(String str)
    {
        int x = 0, y =0;
        for(int i = 0; i<str.length(); i++)
        {
            char dir = str.charAt(i);

            if(dir == 'S')
            {
                y--;
            }
            else if(dir == 'N')
            {
                y++;
            }
            else if(dir == 'E')
            {
                x++;
            }
            else{
                x--;
            }
        }

        int X2 = x * x;

        int Y2 = y * y;

        return (float)Math.sqrt(X2+Y2);

    }
}
