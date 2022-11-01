import java.util.ArrayList;

public class Q7UndergroundTube {

    public static void main(String[] args) {
        ArrayList<String> Tube = new ArrayList<String>();// ArrayList

        //ArrayList Underground tube names
        Tube.add("Northern");
        Tube.add("Central");
        Tube.add("Circle");
        Tube.add("District");
        Tube.add("Hammersmith & City");
        Tube.add("Piccadilly");
        Tube.add("Bakerloo");
        Tube.add("Waterloo & City");
        Tube.add("Jubilee");
        Tube.add("Metropolitan");
        Tube.add("Victoria");
        Tube.add("Northern");

        if (Tube.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
    }
}

