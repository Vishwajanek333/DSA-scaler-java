public class _5_2Darray {
    public static void main(String args[]){
        int[][]arr=new int[4][6];

        // set or assign
        arr[1][3]=8;

        // get or retrive
        System.out.println(arr[1][3]);
        // get or retrive
        System.out.println(arr[2][3]);

        // row count
        System.out.println(arr.length);

        //col count
        System.out.println(arr[0].length);

        // traversal
        for(int i=0;i<arr.length;i++){//  row traversal
            for(int j=0;j<arr[0].length;j++){// col traversal
                System.out.print(arr[i][j]);
            }
        }



    }
}
