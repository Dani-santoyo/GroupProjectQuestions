package GroupProjectCh1Questions;
/* Question 10:
Create 2 methods within the Main class
1. the main method where you will be prompting the user
to enter a string, then calling the second method
2. this second method will be called stringReader and will read a string
entered by the user
 */
import java.util.*;
public class FunctionalDecomposition {
    public static String stringReader(Scanner scanner){
        String input = scanner.next();
        return input;
    }
    public static void main(String[] args){
        System.out.println("Please enter a string: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringReader(scanner));
    }
}
