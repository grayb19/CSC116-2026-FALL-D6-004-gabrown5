import java.util.Scanner;
/**
 * This class helps identify multiple input possibilities and preparedness
 * @author Gracen Brown
 */
public class StudyCheck {
    public static void main(String[] args){

        //reading an input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of hours you studied: ");
        double hours = scanner.nextDouble();

        System.out.println("Have you attended class? (y/n)");
        String answer = scanner.next();

        //checking input from user (both attended class and studied 2 or more hours)
        if (answer.equals("y") && hours >= 2) {
            System.out.println("Ready for the quiz.");
        } else { //else
            System.out.println("Review more before the quiz.");
        }
    } //main method
} //class
