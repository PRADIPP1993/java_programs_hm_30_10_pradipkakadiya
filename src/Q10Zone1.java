import java.util.Scanner;

public class Q10Zone1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("metropolitan\n northern\n jubilee\n bakerloo\n district\n central");
        System.out.println("----------------------");
        System.out.println("Please enter train name form above list: ");
        String city = scanner.nextLine();

        Q10Zone1 cityName = new Q10Zone1();
        cityName.stationName(city);
        scanner.close();

    }

    public void stationName(String city){
        switch (city){
            case"metropolitan":
                System.out.println("Aldgate, Baker Street,Watford, Chesham");
                break;
            case "northern":
                System.out.println("Edware, Morden, Finchley");
                break;
            case "jubilee":
                System.out.println("Stanmore, Straford, WembleyPark");
                break;
            case "bakerloo":
                System.out.println("Harrow, Elephant&Castle, Stonebridge Park, Queens Park");
                break;
            case "District":
                System.out.println("Richmond. Barking, Upminster,");
                break;
            case "central":
                System.out.println("Epping, West Ruislip, Hainault, Loughton  ");
                break;
            default:
                System.out.println("Please enter correct train name:   ");
        }

    }

}

