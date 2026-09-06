import java.util.Scanner;
/**
 * This class helps identifying the total cost of an input number
 * @author Gracen Brown
 */
public class ParkingFee {
    public static void main (String[] args){

    //reading an input from user
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter hours parked: ");
    int hours = scanner.nextInt();

    //checking input from user (less than or equal to one hour)
    if (hours <= 1) {
        System.out.println("Total Fee: $0.00");
    } else { //else
        System.out.println("Total Fee: " + "$" + (hours - 1)*3 + ".00");
        }
    } //main method
} //class
