import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather? (rain, windy, snow, etc)");
        String answer = sc.nextLine();

        /*** using compareTo method
        if (answer.compareTo("rain") == 0) {
            System.out.println("Take your umbrella!");
        } else if (answer.compareTo("windy") == 0) {
            System.out.println("Wear your jacket!");
        } else if (answer.compareTo("snow") == 0) {
            System.out.println("Wear a coat and take a shovel!");
        } else {
            System.out.println("Enjoy your day!");
        }
         ******/

        // using String's equals method
        if (answer.equals("rain")) {
            System.out.println("Take your umbrella!");
        } else if (answer.equals("windy")) {
            System.out.println("Wear your jacket!");
        } else if (answer.equals("snow")) {
            System.out.println("Wear a coat and take a shovel!");
        } else {
            System.out.println("Enjoy your day!");
        }
    }
}