import java.util.Scanner;

public class Calculations {
    public static void main (String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum;
        int product;
        int num3 = 0;
        String phrase1;
        String phrase2 ="";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: " );
        num1 = input.nextInt();

        System.out.print("Enter another number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        System.out.print("Enter a number: ");
        num3 = input.nextInt();
        System.out.println("The square of that number is: " + (num3 * num3));

        System.out.print("Enter a phrase: ");
        input.nextLine();           //If this line isn't present, then I can't assign a string to phrase1
        phrase1 = input.nextLine();
        System.out.print("Enter a phrase: ");
        phrase2 = input.nextLine();

        System.out.println("Your combined phrase is: " + phrase1 + " " + phrase2);

    }
}
