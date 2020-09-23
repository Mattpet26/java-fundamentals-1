package inheritance;

import java.util.LinkedList;

public class Shop extends Restaurant{
    private String description;
    private LinkedList<Review> reviews = new LinkedList<>();

    public Shop(String name, String description, int priceCat) {
        super(name, priceCat);
        this.description = description;
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + priceCat + '\'' +
                '}';
    }
    public void addReview(Review review) {
        reviews.addFirst(review);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setPrice(int priceCat) {
        this.priceCat = priceCat;
    }

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(LinkedList<Review> reviews) {
        this.reviews = reviews;
    }
}
