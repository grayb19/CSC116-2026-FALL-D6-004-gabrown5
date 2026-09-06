import java.util.Scanner;
/**
 * This class helps identifying the quotient of an input number
 * @author Gracen Brown
 */
public class SafeDivision {
    public static void main (String[] args){

        //reading an input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type any integer to be the numerator: ");
        int numerator = scanner.nextInt();

        System.out.println("Type any integer to be the divisor");
        int divisor = scanner.nextInt();

        //checking input from user (proper dividend to then get quotient)
        if (divisor == 0){
            System.out.println("Cannot divide by zero.");
        } else { //else
            System.out.println(numerator / divisor);
        }
    } //main method
} //class