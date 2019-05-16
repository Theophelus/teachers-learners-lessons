import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTests {


    @Test
    public void shouldBeAbleToGetRegisteredTeacher(){
        Teacher teacher = new Teacher("Allan","Ikombe", "allanikombe@gmail.com");
        assertEquals("Allan Ikombe allanikombe@gmail.com", teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getEmail());
    }
}
