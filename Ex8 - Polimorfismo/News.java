public class News extends Post {
    private String source;

    @Override
    public void show() {
        super.show();
        System.out.println(this.source);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}