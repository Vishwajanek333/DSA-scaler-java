import java.util.*;

public class _7_roto_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        {
            int n = sc.nextInt();

            int sum = 0;

            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();

                }
            }
            //  lower  traiangel  of  matrix-> swap (i,j)->(j,i)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            // reverse
            // main logic
            for (int i = 0; i < n; i++) {
                int left = 0, right = n - 1;
                while (left < right) {
                    int temp = arr[i][left];
                    arr[i][left] = arr[i][right];
                    arr[i][right] = temp;
                    left++;
                    right--;
                }
            }
            //output
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}




