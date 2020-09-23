package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testTheatre {
    @Test
    public void testMovieAdd(){
        Theater movie = new Theater("Predator", 5);

        assertEquals("Predator, priced at 5", movie.addMovie());
    }
}
