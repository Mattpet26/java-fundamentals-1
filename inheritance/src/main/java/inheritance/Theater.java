package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater extends Restaurant {
    private String title;
    private LinkedList<Review> reviews = new LinkedList<>();

    public Theater(String name, int priceCat, String title) {
        super(name, priceCat);
        this.title = title;
    }

    public void addMovie(String movie){
        
    }
    public void removeMovie(String movieRemoved){

    }
    public void addReview(Review review) {
        reviews.addFirst(review);
    }

}
