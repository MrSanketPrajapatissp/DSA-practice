import java.util.*;

public class ArraysubPairs {

    public static void arrayPairs(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs : " + tp);

    }

    public static void MaxSubArraySum(int numbers[]) {

        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxsum < currSum) {
                    maxsum = currSum;
                }
            }
        }

        System.out.println("Maximum subarray sum: " + maxsum); // Maximum subarray sum: 8
    }

    public static void KadaneSubArraySum(int numbers[]) { // fix the bug
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        boolean checkAllNegative = true;

        int minNeg = Integer.MIN_VALUE;

        for (int x : numbers) {
            if (x < 0) {
                checkAllNegative = true;

                minNeg = Math.max(x, minNeg);

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms, cs);
        }

        if (checkAllNegative == false) {

            System.out.println("Maximum Subarray sum is " + ms);
        } else {
            System.out.println("Maximum Subarray sum is " + minNeg);

        }

    }

    public static void Subarray(int numbers[]) {
        int ts = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j; // 10 10 20 10 20 30

                for (int k = start; k <= end; k++) {
                    System.out.print(" " + numbers[k]);
                }
                ts++;
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println("Total Subarray: " + ts);

    }

    public static void main(String[] args) {
        int arr[] = { -1, 90, 89, -1, -54 };
        // arrayPairs(arr);
        // Subarray(arr);
        // MaxSubArraySum(arr);
        KadaneSubArraySum(arr);
    }

}
