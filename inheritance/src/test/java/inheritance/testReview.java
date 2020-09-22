package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testReview {
    @Test
    public void testReview() {
        Review newPlace = new Review("Fast food", "bad");
        assertEquals("Fast food is bad quality", newPlace.toString());

    }
}
