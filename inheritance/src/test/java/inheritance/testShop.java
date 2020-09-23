package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testShop {
    @Test
    public void testShopString(){
        Shop shop = new Shop("Jimmys", "We do tires", 5);

        assertEquals("Shop{name='Jimmys', description='We do tires', price='5'}", shop.toString());
    }
    @Test
    public void testShopReview(){
        Shop shop = new Shop("Jimmys", "We do tires", 5);
        shop.addReview(new Review("KingDedede", "I will eat it all", 100, shop));

        assertEquals( "KingDedede", shop.getReviews().getFirst().getAuthor());
        assertEquals("We do tires", shop.getDescription());
        assertEquals(5, shop.getPriceCategory());

    }

}
