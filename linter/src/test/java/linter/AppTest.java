/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        String oneError = "Line 4: Missing semicolon.";
        String oneActual = App.theLintr("src/main/resources/oneError.js");
        assertEquals("Should be missing one semicolon", oneError, oneActual);

        String fewErrors = "Line1: Missing semicolon.\n" +
                "Line3: Missing semicolon.\n" +
                "Line3: Missing semicolon.";
        String fewActual = App.theLintr("src/main/resources/fewErrors.js");
        assertEquals("Should be missing few semicolon", fewErrors, fewActual);

        String manyErrors = "Line3: Missing semicolon.\n" +
                "Line5: Missing semicolon.\n" +
                "Line11: Missing semicolon.";
        String manyActual = App.theLintr("src/main/resources/fewErrors.js");
        assertEquals("Should be missing many semicolon", manyErrors, manyActual);
    }
}
