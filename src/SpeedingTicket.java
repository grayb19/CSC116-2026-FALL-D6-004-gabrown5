import java.util.Scanner;
/**
 * This class helps identifying the range of an input number
 * @author Gracen Brown
 */
public class SpeedingTicket {
    public static void main(String[] args){

        //reading an input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter speed limit" );
        int limit = scanner.nextInt();

        System.out.println("Enter your speed: ");
        int driverspeed = scanner.nextInt();

         //checking input from user for final determination
         if (driverspeed > limit + 5) {
            System.out.println("Ticket Issued.");
         } else {
            System.out.println("No Ticket.");
         }  
    }
}
