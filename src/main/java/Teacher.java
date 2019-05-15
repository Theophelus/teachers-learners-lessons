import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.*;

public class Teacher extends Person {
    //define a and arrayList
    private List<Subjects> containTeacherQualification = new ArrayList();
    //constructor that takes in a super class
    public Teacher(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    /*
    define a method maybe call it checkQualifications that take Subject as Parameter
      * that is ble to check if a particular teacher
      * is qualified to teach specific subject.
    how do I approach it..?
     */
    public void addTeacherQualification(Subjects subjects)
    {
        if (!containTeacherQualification.contains(subjects)) containTeacherQualification.add(subjects);
    }

    /*
    Define a method that will be able to check:
     */

}
