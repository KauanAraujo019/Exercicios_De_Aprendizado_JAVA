package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    LocalDateTime moment;
    String title;
    String content;
    Integer likes;

    List<Comment> listComments = new ArrayList<>();


    public Post(){

    }

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;


    }

    @Override
    public String toString() {
        return  title + "\n"+
                likes +" Likes - " + moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n"+
                content + "\n"+
                "Comments: ";
    }

    public void showComments(){
        for (Comment c : listComments){
            System.out.println(c.text);
        }
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }



    public void setComment(Comment comment) {
        listComments.add(comment);
    }
}
