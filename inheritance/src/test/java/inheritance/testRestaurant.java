package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testRestaurant {
    @Test public void testNewRestaurant() {
        Restaurant newRest = new Restaurant("Arbs", 1);

        assertEquals("Name is set by construct", "Arbs", newRest.getName());
        assertEquals("stars =  0", 0, newRest.getStars());
        assertEquals("price set by construct", 1, newRest.getPriceCategory());

        newRest = new Restaurant("bigM", 3);
        assertEquals("Name is set by construct", "bigM", newRest.getName());
    }

    @Test public void testToString() {
        Restaurant newRest = new Restaurant("Arbs", 1);
        assertEquals("Prints rest info", "Restaurant{name='Arbs', stars=0, priceCategory=1, reviewList=[]}", newRest.toString());
    }

    @Test public void testAddReview() {
        Restaurant newRest = new Restaurant("Arbs", 1);

        newRest.addReview(new Review("KingDedede", "I will eat it all", 100, newRest));
        assertEquals("the review is the list-head", "KingDedede", newRest.getReviewList().getFirst().getAuthor());
        assertEquals("update stars", 100, newRest.getStars());

        newRest.addReview(new Review("King K rool", "NOT FISH?!", 1, newRest));
        assertEquals("the review is the list-head", "King K rool", newRest.getReviewList().getFirst().getAuthor());
        assertEquals("update stars", 50, newRest.getStars());
    }
}

