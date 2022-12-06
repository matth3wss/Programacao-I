import java.util.Date;

public class News extends Post {
    private String source;

    News(String title, Date date, String content, int likes, int dislikes, String source){
        super(title, date, content, likes, dislikes);
        this.source = source;
    }
    
    
    @Override
    public void show(){
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
