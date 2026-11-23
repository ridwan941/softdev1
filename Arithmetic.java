import java.util.Scanner;
public class Arithmetic{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x = 0, y = 0, sum=0;
    System.out.print("Enter first number: ");
    x = input.nextInt();
    System.out.print("Enter second number: ");
    y = input.nextInt();


    sum = x + y;

    System.out.println(x + " + " + y + " = " + sum);
    System.out.println(x + " - " + y + " = " + (x - y));
     System.out.println(x + " * " + y + " = " + (x * y));
       System.out.println(x + " / " + y + " = " + (x / y));
         System.out.println(x + " % " + y + " = " + (x % y));

         float num1 = 23f, num2 =  6f;
         float result = 0f;
         result = num1 / num2;
         System.out.println(num1 + " / " + num2 + " = " + result);
        

    input.close();
}


}


