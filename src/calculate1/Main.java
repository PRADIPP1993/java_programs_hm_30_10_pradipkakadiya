package calculate1;

import java.util.Scanner;

public class Main { // 2.class name main
    public static void main(String[] args) { // 4. main method
        Scanner sc = new Scanner(System.in); // Scanner class use
        sc.close(); // scanner close statements
        Calculator obj = new Calculator();// instance variables so creat obj
        char ch; // non- numeric primitive so use "char"
        do {
            System.out.print("Enter first Number: "); //4. logic
            int a = sc.nextInt();
            System.out.print("Enter second Number: ");//4. logic
            int b = sc.nextInt();
            System.out.print("Please enter one of the symbols +, -, *, / : ");//4. logic
            ch = sc.next().charAt(0);
            obj.calculateResult(a, b, ch); // this obj
            System.out.print("Would you like to do more calculations? Please enter \"Y\" or \"N\": "); // 5. result also one more message
            ch = sc.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y'); // 5. while loop
    }
}

