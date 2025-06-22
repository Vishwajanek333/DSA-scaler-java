import java.util.Scanner;

public class _2_max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //main logic
        // max
        int max=Integer.MIN_VALUE;//-INFINITY
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        // logic min
        int min =Integer.MAX_VALUE;// +INFINITY
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
