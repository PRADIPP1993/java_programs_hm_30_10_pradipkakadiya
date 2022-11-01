import java.util.ArrayList;
import java.util.List;

public class Q6RetrieveElement {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // ArrayList
        list.add("Tiger");
        list.add("Lion");
        list.add("Dog");
        list.add("Cat");
        list.add("Horse");

        System.out.println(list);

        int index = 0; // index always start form 0
        System.out.println(list.get(index));
    }
}
