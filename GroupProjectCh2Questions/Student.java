package GroupProjectCh2Questions;
/* Question 16:
Building on ObjectCreation classes 1-4, the Student class retains all of the same information
that was entered in previous questions. The StudentTester class has been provided, here is
where you will be creating your first Student object.
Make sure you enter the correct data types when creating your first "Student" object.
 */

public class Student {
    private String name;
    private int age, height;
    private double gpa;

    public Student(String name, int age, int height, double gpa){
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

    @Override
    public String toString(){
        return name;
    }
}
