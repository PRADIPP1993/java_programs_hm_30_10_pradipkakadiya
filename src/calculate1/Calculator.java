package calculate1; //1.create one package calculate

public class Calculator { //2. class create calculator

    public void addition(int a, int b) { // 3. instance Methods addition with 2 int parameters
        int c = a + b;
        System.out.println("Addition of " + a + " and " + b + " is: " + c); //print statements
    }

    public void subtraction(int a, int b) { // 3. instance Methods subtraction with 2 int parameters
        int c = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + c); //print statements
    }

    public void division(int a, int b) {//3. instance Methods division with 2 int parameters
        int c = a / b;
        System.out.println("Division of " + a + " and " + b + " is: " + c);//print statements
    }

    public void multiplication(int a, int b) {//3. instance Methods multiplication with 2 int parameters
        int c = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + c);//print statements
    }

    public void calculateResult(int a, int b, char symbol) { // one more method is calculateResult with 3 parameter
        switch (symbol) { // switch method with break
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default: // not use any symbol so print Invalid Symbol massages
                System.out.println("Invalid Symbol");
        }
    }
}
