import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTests {


    @Test
    public void shouldBeAbleToGetRegisteredTeacher(){
        Teacher teacher = new Teacher("Allan","Ikombe", "allanikombe@gmail.com");
        assertEquals("Allan Ikombe allanikombe@gmail.com", teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getEmail());
    }
    @Test
    public void shouldBeAbleToCheckHowManySubjectsATeacherTeach(){
        Teacher teacher = new Teacher("Allan","Ikombe", "allanikombe@gmail.com");
        teacher.addTeacherQualification(Subjects.maths);
        assertEquals(1,teacher.getAddedTeacherQualifications());
    }

    @Test
    public void shouldBeAbleToGetAllSubjectASpecificTeacherCanTeach(){
        Teacher teacher = new Teacher("Allan","Ikombe", "allanikombe@gmail.com");
        teacher.addTeacherQualification(Subjects.maths);
        teacher.addTeacherQualification(Subjects.isixhosa);
        String expected = "SPECIFIC SUBJECTS A TEACHER QUALIFIED TO TEACH: \n" +
                "\t maths\n"+
                "\t isixhosa\n";
        assertEquals(expected, teacher.getTeacherSubjects());
    }
}
