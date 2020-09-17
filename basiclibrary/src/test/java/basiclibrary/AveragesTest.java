package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AveragesTest {
    @Test
    public void testAverageOfArrays(){
        Averages averages = new Averages();
        assertArrayEquals(new int[]{1,2,3}, averages.lowestOfAverages(new int[][]{{1,2,3}, {10,20,30}}));
    }
}
