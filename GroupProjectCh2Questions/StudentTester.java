package GroupProjectCh2Questions;

import java.util.ArrayList;

/* Question 17 (read only when you have completed question 16):
Now that you have created your first student, go ahead and create 3 more (create
a student with the age 15), all with their own unique values.
Now that you have 4 students, create an ArrayList called school. You will then add
all 4 Student objects to this ArrayList.

Question 18 (read only when you have completed question 17):
Your school has an underage student at the school! Create code that iterates
through your array list and spots if a student's age is below 18. Remove that
student from the array list.

Question 19 (read only when you have completed question 18):
Now that you have removed the underage student you will need to print the new list.
To do this create an @Override statement in your Student class. Print your
new list.
 */
public class StudentTester {
    public static void main(String[] args){
        //Solution to question 16:
        Student stu1 = new Student("Daniel", 22, 69, 3.3);
        //Solution to question 17:
        Student stu2 = new Student("Daniela", 21, 62, 3.3);
        Student stu3 = new Student("John", 15, 72, 3.0);
        Student stu4 = new Student("Isa", 22, 60, 3.5);

        ArrayList<Student> school = new ArrayList<>();
        school.add(stu1);
        school.add(stu2);
        school.add(stu3);
        school.add(stu4);
        //Solution to Question 18:
        for(int i = 0; i < school.size(); i++) {
            if (school.get(i).getAge() < 18) {
                    school.remove(school.get(i));
            }
        }
        System.out.println(school);

    }
}

