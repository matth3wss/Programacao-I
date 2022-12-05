public class ProductReview extends Post implements Evaluate {
    private String brand;
    private int stars;

    @Override
    public void show(){

    }

    @Override
    public void evaluate(int value) {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

}
