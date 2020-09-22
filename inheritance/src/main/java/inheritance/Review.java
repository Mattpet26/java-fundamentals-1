package inheritance;

public class Review{
    private String restType;
    private String foodQual;
    private int stars;

    public Review(String restType, String foodQual, stars) {
        this.restType = restType;
        this.foodQual = foodQual;
        this.stars = stars;
    }
    public int getStars() {
        return stars;
    }
    public String getRestType() {
        return restType;
    }

    public void setRestType(String restType) {
        this.restType = restType;
    }

    public String getFoodQual() {
        return foodQual;
    }

    public void setFoodQual(String foodQual) {
        this.foodQual = foodQual;
    }

    public String toString(){
        return String.format("Fast food is bad quality", restType, foodQual);
    }
}
