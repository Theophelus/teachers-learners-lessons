import java.util.ArrayList;
import java.util.List;

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
    Define a method that will check if subjects that a specific teacher teaches are >= 1
        * if then that teacher can teach
     */


    /*
    Define a method that will get the size of added subjects:
     */
    public Integer getAddedTeacherQualifications(){
        return containTeacherQualification.size();
    }

    /*
    define a method that will give control of subjects that are already in the list
     */

    /*
    define a method that will return all subjects a specific teacher teaches
     */

    public String getTeacherSubjects(){

        StringBuilder builder = new StringBuilder("SPECIFIC SUBJECTS A TEACHER QUALIFIED TO TEACH: \n");
        List<Subjects> subjects = containTeacherQualification;

        for(Subjects subs: subjects){
            builder.append(String.format("\t %s\n", subs));
        }
        return builder.toString();
    }
}
