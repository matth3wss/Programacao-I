import java.util.Date;
import java.text.SimpleDateFormat;

public class Post {
    private String title;
    private Date date;
    private String content;
    private int likes;
    private int dislikes;

    public void show() {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Título: " + this.title);
        System.out.println("Data: " + formatter.format(this.date));
        System.out.println("Conteúdo: " + this.content);
        System.out.println("Likes: " + this.likes);
        System.out.println("Dislikes: " + this.dislikes);
    }

    public void like() {
        this.likes++;
    }

    public void dislike() {
        this.dislikes++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
}