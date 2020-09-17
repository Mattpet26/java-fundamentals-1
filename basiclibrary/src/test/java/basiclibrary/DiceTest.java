package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void testDiceRoll() {
        Dice rolling = new Dice(); // reference the main file with Dice, and rename the classUnder to rolling
        int[] output = rolling.roll(1000); // setting up an expected output, does it work testing
        // has at least one 1
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for (int i = 0; i < output.length; i++) {
            if (output[i] == 1) {
                ones++;
            }
            if (output[i] == 2) {
                twos++;
            }
            if (output[i] == 3) {
                threes++;
            }
        }
        assertTrue("There should be at least one 1", ones > 0);
        assertTrue("There should be at least one 2", twos > 0);
        assertTrue("There should be at least one 3", threes > 0);
        assertEquals("The length should be 1k", 1000, output.length);
        assertEquals("ones twos and threes should add to 1000", 1000, ones+twos+threes);
        assertTrue("ones should be > 22%", ones > 200);
    }
}
