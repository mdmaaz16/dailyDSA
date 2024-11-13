import java.util.Arrays;
import java.util.Scanner;

public class zeeshan {
    public static int maxBeauty(int[] arr) {
        int n = arr.length;

        // Sort the array in descending order to maximize prefix sum contributions
        Arrays.sort(arr);

        // Rearrange in optimal order for maximizing alternating sum (large-small-large-small pattern)
        int[] optimalArr = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                optimalArr[i] = arr[right--];
            } else {
                optimalArr[i] = arr[left++];
            }
        }

        // Create the prefix sum array `psum` for the optimal arrangement
        int[] psum = new int[n];
        psum[0] = optimalArr[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + optimalArr[i];
        }

        // Calculate the beauty of psum as an alternating sum
        int beauty = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                beauty += psum[i];
            } else {
                beauty -= psum[i];
            }
        }

        return beauty;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read each element of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and print the maximum beauty of psum
        int result = maxBeauty(arr);
        System.out.println(result);

        scanner.close();
    }
}
