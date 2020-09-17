package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicatesTest {
    @Test
    public void testContainsDuplicates(){
        ContainsDuplicates contDupe = new ContainsDuplicates();
        assertTrue("This one does", contDupe.containsDuplicates(new int[]{1,2,1}));
        assertFalse("This one doesn't", contDupe.containsDuplicates(new int[]{1,2,3,4,5}));
    }
}
