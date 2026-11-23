import java.util.Scanner;
public class scannerexample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = null;
        int number = 0;
        float dec = 0;


        System.out.print("Enter your name: ");
        firstName = input.next();
        System.err.println("First name:" + firstName);

        System.out.println("Enter a whole number: ");
        number = input.nextInt();

        System.out.println("Enter a decimal numnber: ");
        dec = input.nextFloat();

        System.out.println( number + " and " + dec);
        input.close();


        
    }
}
