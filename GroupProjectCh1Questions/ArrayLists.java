package GroupProjectCh1Questions;

import java.util.ArrayList;

/* Question 9:
Create an array list with string values. Add your name to it, as well as your favorite hobby,
and favorite food. use the .add() method. Print the updated array list at the end.
ex:
[John, fishing, chicken nuggets]
 */
public class ArrayLists {
    public static void main(String[] args){
        //solution
        ArrayList<String> person = new ArrayList<>();
        person.add("Daniel");
        person.add("Soccer");
        person.add("Enchiladas");
        System.out.println(person);
    }
}
