public class Q3ArrayInteger {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; // Array of In terger values

        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) { // for loop

            reversedArray[i] = array[array.length - 1 - i];

        }
        System.out.println("Reversed array: ");

        for (int i = 0; i < reversedArray.length; i++) {//for loop

            System.out.print(reversedArray[i] + " ");

        }

    }

}

