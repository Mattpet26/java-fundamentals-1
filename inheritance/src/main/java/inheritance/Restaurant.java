package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String priceCat;
    private float stars;
    private int numReview = 0;
    private ArrayList<Review> listOfRev = new ArrayList<>();

    public Restaurant(String name, String priceCat, int stars) {
        this.name = name;
        this.priceCat = priceCat;
        this.stars = stars;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getPriceCat() {
        return priceCat;
    }
    public void setPriceCat(String priceCat) {
        this.priceCat = priceCat;
    }
    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        float newStarCount = this.stars + stars;
        this.stars = newStarCount/numReview;
    }

    public ArrayList<Review> getListOfRev() {
        return listOfRev;
    }

    public void setListOfRev(ArrayList<Review> listOfRev) {
        this.listOfRev = listOfRev;
    }

    public String toString(){
        return String.format("{%s} has {%d} stars, and {%s} money", name, stars, priceCat);
    }
    public String addRestaurant(String name, String priceCat, int stars){
        return String.format("Added %s as a Restaurant", name);
    }

    public String addReview(String restType, String foodQual, stars){
        Review newReview = new Review(restType, foodQual);
        listOfRev.add(newReview);
        numReview++;
        this.setStars(newReview.getStars());

        for(Review taters : listOfRev){
            System.out.println(taters);
        }
        return String.format("I gave %s %d stars because they are too %s. Their food is %s for a %s", name, stars, restType, restType, foodQual);
    }
}
