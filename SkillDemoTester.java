import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    
    @Test
    public void slope(){
        assertEquals(2,SkillDemo.slopeCalc(1, 1, 3, 3));
    }
}
