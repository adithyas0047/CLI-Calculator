import java.util.Scanner;

public class calci {
    public static int calculator(int a, int b, int choice) {
        switch(choice) {
            case 1: 
                int add = a + b;
                System.out.println("Sum of two values: "+ add);
                break;
            case 2: 
                int sub = a - b;
                System.out.println("Subtraction of two values: "+ sub);
                break;
            case 3: 
                int mul = a * b;
                System.out.println("Product of two values: " + mul);
                break;
            case 4:
                if(b == 0) {
                    System.out.println("Error: Division by Zero");
                    return Integer.MIN_VALUE;
                } 
                int div = a / b;
                System.out.println("Division of two values: " + div);
                break;
            case 5: 
                if(b == 0) {
                    System.out.println("Error: Modulus by Zero");
                    return Integer.MIN_VALUE;
                }
                int mod = a % b;
                System.out.println("Modulus of two values: " + mod);
                break;
            default: 
                System.out.println("Invalid Choice");
                return Integer.MIN_VALUE;
        }

        return choice;

    }
    public static void main(String[] args) {
        System.out.println("Hey, Welcome to CLI Calculator.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("Choose any!");

        int choice = sc.nextInt();

        int result = calculator(firstNumber, secondNumber, choice);
        System.out.println(result);

        sc.close();
    }
}