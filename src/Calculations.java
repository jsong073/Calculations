import java.util.Scanner;

public class Calculations {
    public static void main (String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum;
        int product;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: " );
        num1 = input.nextInt();

        System.out.print("Enter another number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

    }
}
