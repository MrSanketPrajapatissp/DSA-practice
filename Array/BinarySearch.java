public class BinarySearch {

    public static int BinarySearchMethod(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {
                12, 234, 345, 5657, 7687, 67688
        };

        int key = 7687;
        int novalidKey = 393;

        int index = BinarySearchMethod(arr, key);

        if (index == -1) {
            System.out.println("key is not found");
        } else {
            System.out.println("key is found at index : " + index);
        }
    }
}

// OUTPUT: key is found at index : 4