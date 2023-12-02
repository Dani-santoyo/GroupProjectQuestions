package GroupProjectCh2Questions;
/* Question 20:
Create a main method within a class called innerClass, within a class called outerClass,
within class NestedClasses. Now declare an int with a value and try to manipulate it in outerClass,
you will see that an error pops up, this is because the int variable is local only to the
main method.
 */
public class NestedClasses {
    class OuterClass{
        //Solution
        num += 10;
        class InnerClass{
            public static void main(String[] args){
                int num = 10;
            }
        }
    }
}
