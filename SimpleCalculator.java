import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, result = 0;
        int choice;

        System.out.print("Enter First Number: ");
        num1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        num2 = input.nextDouble();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {

            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    input.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid Choice!");
                input.close();
                return;
        }

        System.out.println("Result = " + result);

        input.close();
    }
}
