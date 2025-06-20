import java.util.*;

class main{
    public static void main (String [] args){

        // array  with intializing
        int[]array={1,2,3,4,5};

        // length
        System.out.println(array.length);

        //  array  with initiaally array
        int[] array1= new int [1];
        System.out.println(array1);// print the  array object it not correct

        // correct way
        System.out.println(Arrays.toString(array1));//built in method  to print
        //an array in readable foramt :  array into string
        //[I@7b23ec81: its  memory address

        //get  the ele
        System.out.println(array[2]);

        //set or change  the value
        array[2]=19;
        System.out.println(array[2]);

        //  travesal
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }


    }
}
















