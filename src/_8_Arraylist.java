import java.util.*;
public class _8_Arraylist {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //add at index

        list.add( 1,50);
        System.out.println(list);

        // get
        System.out.println(list.get(2));

        // set
        list.set(3,60);
        System.out.println(list);

        //remove
        list.remove(1);
        System.out.println(list);

        //size
        System.out.println(list.size());

        // string
        System.out.println(list.toString());
    }
}
