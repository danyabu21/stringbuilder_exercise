import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Comment comment_1 = new Comment("Have a nice trip");
        Comment comment_2 = new Comment("Wow that's awesome!");

        Comment comment_3 = new Comment("Good night");
        Comment comment_4 = new Comment("May the Force be with you");

        LocalDateTime date_comment_1 = LocalDateTime.parse("2024-06-21T13:05:44");
        LocalDateTime date_comment_2 = LocalDateTime.parse("2018-07-28T23:14:19");

        Post post_1 = new Post(date_comment_1, "Traveling to New Zealand",
                "I'm going to visit this wonderful country", 12);
        Post post_2 = new Post(date_comment_2, "Good night guys", "See you tomorrow", 5);

        post_1.addComment(comment_1);
        post_1.addComment(comment_2);

        post_2.addComment(comment_3);
        post_2.addComment(comment_4);

        System.out.println( post_1);
        System.out.println("------------------");
        System.out.println( post_2);
    }
}