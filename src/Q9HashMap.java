import java.util.HashMap;
import java.util.Map;

public class Q9HashMap {

    public static void main(String[] args) {

        HashMap<String,Integer> people=new HashMap<String,Integer>(); //String Keys and Interger Values
        people.put("student1", 1);
        people.put("student2", 2);
        people.put("student3", 3);
        people.put("student4", 4);
        people.put("student5", 5);


        for(Map.Entry<String, Integer> mapp : people.entrySet()) { //for each loop
            System.out.println(mapp.getKey() + ": " + mapp.getValue());
        }
    }
}
