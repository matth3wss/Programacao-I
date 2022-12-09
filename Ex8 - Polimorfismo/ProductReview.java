public class ProductReview extends Post implements Evaluable {
    private String brand;
    private int stars;

    @Override
    public void show() {
        super.show();
        System.out.println("Marca: " + this.brand);
        System.out.println("Estrelas: " + this.stars);
    }

    @Override
    public void evaluate(int value) {
        if (value >= 1 && value <= 10) {
            this.stars = value;
        } else {
            System.out.println("Valor inválido, avalie entre 1 a 10 estrelas");
        }
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