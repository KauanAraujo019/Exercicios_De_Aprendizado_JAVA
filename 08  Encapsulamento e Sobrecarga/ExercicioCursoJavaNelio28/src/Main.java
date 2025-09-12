import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        post1.setMoment(LocalDateTime.parse("21/06/2018 13:05:44", dateFormatter));
        post1.setTitle("Traveling to new zealand!");
        post1.setContent("I'm going to visit this wonderful country!");
        post1.setLikes(12);


        post1.setComment(new Comment("Have a nice trip!"));
        post1.setComment(new Comment("wow tha't is awesome!"));

        System.out.println(post1);
        post1.showComments();
        System.out.println();


        Post post2 = new Post();
        post2.setMoment(LocalDateTime.parse("28/07/2018 23:14:19", dateFormatter));
        post2.setTitle("Good night guys!");
        post2.setContent("see you tomorrow!");
        post2.setLikes(5);


        post2.setComment(new Comment("Good night"));
        post2.setComment(new Comment("May the force be with you"));

        System.out.println(post2);
        post2.showComments();



    }
}