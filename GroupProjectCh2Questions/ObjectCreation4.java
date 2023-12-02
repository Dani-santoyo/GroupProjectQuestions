package GroupProjectCh2Questions;
/* Question 15:
Create setters for all instance variables mentioned in the previous questions.
 */

public class ObjectCreation4 {
    private String name;
    private int age, height;
    private double gpa;

    public ObjectCreation4(String name, int age, int height, double gpa){
        this.name = name;
        this.age = height;
        this.height = height;
        this.gpa = gpa;
    }
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
//Solution:
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
}
