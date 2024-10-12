import java.util.*; 


public class LargestSmallest {


        public static int getLargest(int arr[])
        {
            int Largest = Integer.MIN_VALUE;

            for(int i = 0; i<arr.length; i++)
            {
                if(Largest < arr[i])
                {
                    Largest = arr[i];
                }
            }

            return Largest;
        }

        public static int getSmallest(int arr[])
        {
            int Smallest = Integer.MAX_VALUE;

            for(int i = 0; i<arr.length; i++)
            {
                if(Smallest > arr[i])
                {
                    Smallest = arr[i];
                }
            }

            return Smallest;
        }

        public static void main(String[] args) {
            

            int [] arr = {12,43,4423,22,23};

            System.out.println("Largest Element in an array: "+getLargest(arr));
            System.out.println("Smallest Element in an array: "+getSmallest(arr));


        }    
}
