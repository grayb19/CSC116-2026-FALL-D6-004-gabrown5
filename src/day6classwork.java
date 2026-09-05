import java.util.Scanner;
/**
 * This class helps identifying the range of an input number
 * @author Gracen Brown
 */

public class day6classwork {
    public static void main (String[] args){

        //reading an input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = scanner.nextInt();

        //checking input from user (range of number)
        if (number >= 10 && number <= 20) {
            System.out.println("Your number is within range.");
        } else { //else
            System.out.println("Your number not in range.");
        }

    } //main method
    
}//class
