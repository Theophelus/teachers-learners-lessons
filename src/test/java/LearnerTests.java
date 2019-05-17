import org.junit.jupiter.api.Test;
import teachers.Learner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnerTests {

    @Test
    public void shouldBeAbleToGetRegisteredStudent(){
        Learner learner = new Learner("","","");
        assertEquals("", learner.getFirstName() + " " + learner.getLastName() + " " + learner.getEmail());
    }

}
