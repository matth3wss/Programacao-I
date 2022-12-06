import java.util.Date;
public class ProductReview extends Post implements Evaluate {
    private String brand;
    private int stars;

    ProductReview(String title, Date date, String content, int likes, int dislikes, String brand, int stars){
        super(title, date, content, likes, dislikes);
        this.brand = brand;
        this.stars = stars;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(this.brand);
        System.out.println(this.stars);
    }

    @Override
    public void evaluate(int value) {
        this.stars = value;
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
