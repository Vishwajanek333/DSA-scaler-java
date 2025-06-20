import java.util.Scanner;

public class _4_subarray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int sum = 0;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        // main logic
            for(int si =0;si<n;si++){
                for(int en=si;en<n;en++){

                    for(int k=si;k<=en;k++){
                        System.out.print(arr[k] + " ");
                    }
                }
                System.out.println();
            }

        }
}
