import java.util.*;
public class _1_sumarray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        int sum=0;

        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        // main logic
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.print(sum + " ");

    }
}
