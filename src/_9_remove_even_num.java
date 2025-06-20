import java.util.*;
class _9_RemoveEvenNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 4, 15, 8, 21, 3, 2));
        removeEven(list);
        System.out.println("List after removing even numbers: " + list);
    }

    public static void removeEven(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
