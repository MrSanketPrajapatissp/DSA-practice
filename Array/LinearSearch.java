import java.security.Key;

public class LinearSearch {

    public static int LSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String arr[] = { "Sanket", "Ram", "ankush", "om", "kunal" };

        String key = "om";

        int index = LSearch(arr, key);

        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("" + key + " Key is found at " + index);
        }

    }
}
 // OUTPUT: om Key is found at 3