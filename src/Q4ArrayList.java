import java.util.ArrayList;

public class Q4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();//ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("black");

        for (String color : colors) {// For each loop
            System.out.println(color);
        }
    }
}

