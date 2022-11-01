import java.util.ArrayList;
import java.util.Iterator;

public class Q5ElementsList {
    public static void main(String[] args)
    {
        // Declaring an Iterator
       Iterator itr;

        // Creating an ArrayList
        ArrayList<String>list = new ArrayList<String>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Obtaining an iterator
       itr = list.iterator();

        // Iterating over the elements
        System.out.println("Elements are:");
        while (itr.hasNext()){ // while loop

            // Moving cursor to next element
            Object element = itr.next();
              System.out.println(element);
        }
    }
}