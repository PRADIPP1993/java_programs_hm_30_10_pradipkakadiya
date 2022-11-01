import java.util.HashSet;

public class Q8HashSet {
    public static void main(String[] arge) {
        HashSet<Integer> set = new HashSet<Integer>(); //HashSet
//Storevthe Number 4,7,8 to sets
        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 1; i <= 10; i++) {    //for loop
            if (set.contains(i)) { // if else
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}
