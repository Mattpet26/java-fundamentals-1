package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testRestaurant {

    @Test
    public void testConstructor() {
        Restaurant newPlace = new Restaurant("arbs", "$", 2);
        assertEquals("{arbs} has {2} stars, and {$} money", newPlace.toString());

        assertEquals("I gave arbs 2 stars because they are too Fast food. Their food is Fast food for a meh", newPlace.addReview("Fast food", "meh"));
        assertEquals(2.0, newPlace.getStars());
    }
}

