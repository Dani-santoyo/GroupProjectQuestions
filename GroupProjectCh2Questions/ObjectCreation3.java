package GroupProjectCh2Questions;
/* Question 14:
Create Getters for each of the instance variables used in the last questions
 */
public class ObjectCreation3 {
    private String name;
    private int age, height;
    private double gpa;

    public ObjectCreation3(String name, int age, int height, double gpa){
        this.name = name;
        this.age = height;
        this.height = height;
        this.gpa = gpa;
    }
//Solution:
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public double getGpa(){
        return gpa;
    }
}
