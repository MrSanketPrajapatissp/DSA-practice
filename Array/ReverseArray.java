public class ReverseArray {

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        int first = 0;
        int last = arr.length - 1;

        printArr(arr);

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        printArr(arr);

    }
}
