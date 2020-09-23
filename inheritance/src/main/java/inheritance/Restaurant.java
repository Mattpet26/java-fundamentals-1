package inheritance;

import java.util.LinkedList;

public class Restaurant{

    public String name;
    private int stars = 0;
    public int priceCat;
    private LinkedList<Review> reviews = new LinkedList<>();

    public Restaurant(String name, int priceCat) {
        this.name = name;
        this.priceCat = priceCat;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory=" + priceCat +
                ", reviewList=" + reviews +
                '}';
    }
    public void addReview(Review review) {
        reviews.addFirst(review);
        addStars();
    }
    private void addStars() {
        int total = reviews.stream().mapToInt(Review::getStars).sum();
        stars = total / reviews.size();
    }
    public String getName() {
        return name;
    }
    public int getStars() {
        return stars;
    }
    public int getPriceCategory() {
        return priceCat;
    }
    public LinkedList<Review> getReviewList() {
        return reviews;
    }
}
