package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testReview {
    @Test public void testNewReview() {
        Restaurant newRest = new Restaurant("Arbs", 1);
        Review newRev = new Review("KingDedede", "I will eat it all", 100, newRest);

        assertEquals("The author should be set", "KingDedede", newRev.getAuthor());
        assertEquals("The restaurant should have a review", newRev, newRest.getReviewList().getFirst());

        newRev = new Review("King K rool", "NOT FISH?!", 1, newRest);
        assertEquals("The instance body is set", "NOT FISH?!", newRev.getBody());
    }

    @Test public void testToString() {
        Restaurant newRest = new Restaurant("BobsBergs", 1);
        Review newRev = new Review("Mario", "Its a great!!", 5, newRest);

        assertEquals("instance should output pretty print", "Review{restaurant='BobsBergs', author='Mario', stars=5, body='Its a great!!'}", newRev.toString());
    }
}
