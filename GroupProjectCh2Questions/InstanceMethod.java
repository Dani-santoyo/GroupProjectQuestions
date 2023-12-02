package GroupProjectCh2Questions;
/* Question 11:
Create an instance method that will read the users input and return it. Call this method
in the main method. *hint: instance methods use objects to call them*
 */
import java.util.*;
public class InstanceMethod {
    //Solution:
    public String getString(Scanner scanner){
        String input = scanner.next();
        return input;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string: ");
        InstanceMethod instanceMethod = new InstanceMethod();
        System.out.println(instanceMethod.getString(scanner));
    }
}
