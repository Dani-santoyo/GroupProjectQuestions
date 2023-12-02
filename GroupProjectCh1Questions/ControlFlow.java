package GroupProjectCh1Questions;
/* Question 7:
You are to prompt the user to enter a test score between 0-100. If the user enters an invalid number give them
a message of "please enter a valid test score 0-100".
1. if the user scores 90 or above print the message: "Wow! Amazing!"
2. if the user scores 80-89: "Good job!"
3. 70-79: "alright, could be better"
4. 60-69: "needs improvement"
5. below 60: "you stink!"
 */
//Solution:
import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] args){
        System.out.println("Please enter a test score (0-100): ");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        String comment = " ";
        if(grade >= 90 && grade <= 100){
            comment = "Wow! Amazing!";
        }else if(grade >= 80 && grade < 90){
            comment = "Good job!";
        }else if(grade >= 70 && grade < 80){
            comment = "Alright, could be better.";
        }else if(grade >= 60 && grade < 70){
            comment = "Needs improvement";
        }else if(grade >= 0 && grade < 60){
            comment = "You stink!";
        }else{
            comment = "Please enter a valid test score 0-100.";
        }
        System.out.println(comment);
    }
}
