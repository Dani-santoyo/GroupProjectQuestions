package GroupProjectCh1Questions;
/* Question 6:
    1.import the scanner class
    2. prompt the user to enter a name
    3. create a scanner object to be the next string the user enters
    4. print out a greeting using the name that the user entered.
    ex. "Hello there, John!"
 */
//Solution:
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args){
        System.out.println("Please enter a name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("How's it going " + name + "?");
    }
}
