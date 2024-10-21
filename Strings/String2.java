public class String2 {

    public static String subString(String str, int si, int ei)
    {
        String substr = "";

        for(int i = si; i<=ei; i++)
        {
            substr += str.charAt(i);
        }

        return substr;
    }
    

    public static String LargestString(String Str[])
    {
            String largest = Str[0];
            for(int i = 0; i<Str.length; i++)
            {
                if(largest.compareTo(Str[i]) < 0)
                {
                    largest = Str[i];
                }
            }
            return largest;
    }

    public static void main(String[] args) {
    //     System.out.println("Substring: "+subString("Hello World",0,4));
    //     String str = "Hello World";
    //     System.out.println("Substring: "+str.substring(0,4)); '\
            String fruit[] = {"apple", "mango", "banana"};
            System.out.println("Largest String : "+LargestString(fruit));
}
}
