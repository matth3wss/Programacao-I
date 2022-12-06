import java.util.Date;

public class Post {
    private String title;
    private Date date;
    private String content;
    private int likes;
    private int dislikes;

    Post(String title, Date date, String content, int likes, int dislikes) {
        this.title = title;
        this.date = date;
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public void show() {
        System.out.println(this.title);
        System.out.println(this.date);
        System.out.println(this.content);
        System.out.println(this.likes);
        System.out.println(this.dislikes);
    }

    public void like() {
        this.likes += 1;
    }

    public void dislike() {
        this.dislikes += 1;

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

    public void setDate(Date date) {
        this.date = date;
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
