import org.junit.jupiter.api.Test;
import schoolSystem.Subjects;
import schoolSystem.Teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTests {

    Teacher teacher;

    @Test
    public void shouldBeAbleToGetRegisteredTeacher(){
        teacher = new Teacher("Allan","Ikombe", "allanikombe@gmail.com");
        assertEquals("Allan Ikombe allanikombe@gmail.com", teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getEmail());
    }
    @Test
    public void shouldBeAbleToCheckHowManySubjectsATeacherTeach(){
        teacher = new Teacher("Allan","Ikombe", "allanikombe@gmail.com");
        teacher.addTeacherQualification(Subjects.maths);
        // teacher.getQualificationCount()
        assertEquals(1, teacher.getQualificationCount());
    }

    @Test
    public void shouldBeAble3ToGetAllSubjectASpecificTeacherCanTeach(){
        teacher = new Teacher("Allan","Ikombe", "allanikombe@gmail.com");
        teacher.addTeacherQualification(Subjects.maths);
        teacher.addTeacherQualification(Subjects.isixhosa);
        String expected = "SPECIFIC SUBJECTS A TEACHER QUALIFIED TO TEACH: \n" +
                "\t maths\n"+
                "\t isixhosa\n";
        assertEquals(expected, teacher.getTeacherSubjects());
    }

    @Test
    public void teacherShouldBeAbleToTeach(){
        teacher = new Teacher("Allan","Ikombe", "allanikombe@gmail.com");
        teacher.addTeacherQualification(Subjects.maths);
        assertEquals(true, teacher.canTeachSubject(Subjects.maths));
        assertEquals(false, teacher.canTeachSubject(Subjects.isixhosa));
    }

}


