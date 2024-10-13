



public class Sorting {
   

    public static void main(String args[]) {
        // int arr[] = {5, 4, 6, 1, 2, 3};
        int arr[] = {5,4,3,2,1};  // Use Integer type instead of int while using Collection.reverseOrder()
      //   Arrays.sort(arr, Comparator.reverseOrder());
      //   Arrays.sort(arr,0,3, Collections.reverseOrder());
      //   Arrays.sort(arr, 0,3);  //Inbuilt function to sort
      //   InsertionSort(arr);
      //   SelectionSort(arr);
      CountSort(arr);
      printArr(arr);

    }

    public static void CountSort(int arr[])
    {
      int largest = Integer.MIN_VALUE;
      for(int i = 0; i< arr.length; i++){
         largest = Math.max(arr[i],largest);
      }

      int count[] = new int[largest+1];

      for(int i = 0; i<arr.length; i++)
      {
         count[arr[i]]++;
      }

      int j = 0; 
      for(int  i = 0; i<count.length; i++)
      {
         while(count[i] > 0)
         {
            arr[j] = i;
            j++;
            count[i]--;
         }
      }
    }    
    

    public static void printArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    

    public static void SelectionSort(int arr[])  // O(n^2)
    {
      int minPos;

      for(int i = 0; i<arr.length-1; i++)
      {
         minPos = i;

         for(int j = i+1; j<arr.length; j++)
         {
            if(arr[minPos] > arr[j])  // change the sign to < for decreasing order
            {
               minPos = j;
            }
         }

         int temp = arr[minPos];
         arr[minPos] = arr[i];
         arr[i] = temp;
      }
    }


    public static void InsertionSort(int arr[])
    {
      for(int i = 1; i < arr.length; i++)
      {
         int curr = arr[i];
         int prev = i -1; 


         // finding out correct location to insert
         while(prev >= 0 && arr[prev] > curr) // for decreasing order change the sign arr[prev] < curr
         {
            arr[prev + 1] = arr[prev];
            prev--;
         }

         arr[prev+1] = curr;


      }
    }

    public static void BubbleSort(int[] array) {  // O(n^2)
       for(int turn = 0; turn < array.length - 1; ++turn) {
        int swap = 0; 
          for(int j = 0; j < array.length - 1 - turn; ++j) {
             if (array[j] > array[j + 1]) {  // change the sign to < for decreasing order
                int var3 = array[j];
                array[j] = array[j + 1];
                array[j + 1] = var3;
                swap++;
             }
          }

          if(swap <= 0)
          {
            break;
          }
       }
 
    }
 
    
 }
 