package GroupProjectCh1Questions;
/* Question 5
Declare a String with the name greeting to have a value of "Hello, my name is ". Next declare a string with the name
"name" and give a string value with your name. Last, concatenate the greeting string with the name string. Don't forget
to also add spaces where needed!
 */
public class Strings {
    public static void main (String[] args){
        //Solution
        String greeting = "Hello, my name is ";
        String name = "Daniel";
        greeting += " " + name;
        System.out.println(greeting);
        //Solution should print out: "Hello, my name is Daniel"
    }
}
