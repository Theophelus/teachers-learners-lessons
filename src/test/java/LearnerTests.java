import org.junit.jupiter.api.Test;
import teachers.Learner;
import teachers.Subjects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnerTests {
    Learner learner;
    @Test
    public void shouldBeAbleToGetRegisteredStudent(){
        Learner learner = new Learner("","","");
        assertEquals("", learner.getFirstName() + " " + learner.getLastName() + " " + learner.getEmail());
    }

    @Test
    public void shouldBeAbleToRegisterStudentSubjects(){
        Learner learner = new Learner("Nannie","Class","nannieclass@gmail.com");
        learner.addStudentSubjects(Subjects.english);
        String expected = "REGISTERED SUBJECTS:\n"+
                "\t english\n";
        assertEquals(expected, learner.getRegisteredSubjects());
    }

    @Test
    public void shouldBeAbleToGetTheSizeOfSubjectsLearnersRegisteredFor(){
        Learner learner = new Learner("Nannie","Class","nannieclass@gmail.com");
        learner.addStudentSubjects(Subjects.english);
        learner.addStudentSubjects(Subjects.maths);
        learner.addStudentSubjects(Subjects.isixhosa);
        assertEquals("Learn can attend class", learner.attendLesson(Subjects.english));

    }

}
