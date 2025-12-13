package s10.exercicies;

import s10.entities.Comment;
import s10.entities.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class EditComments {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LocalDateTime moment1 = LocalDateTime.parse("21/06/2018 13:05:44", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String title1 = "Traveling to New Zeland";
        String content1 = "Im going to visit this wonderful country";
        int likes1 = 12;
        Post post1 = new Post(moment1, title1, content1, likes1);
        List<Comment> comments1 = new ArrayList<>();
        Comment commment1 = new Comment("Have a nice trip");
        Comment commment2 = new Comment("Wow thats awesome!");
        post1.getComments().add(commment1);
        post1.getComments().add(commment2);

        LocalDateTime moment2 = LocalDateTime.parse("28/07/2018 23:14:19", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String title2 = "Good night guys";
        String content2 = "See you tommorow";
        int likes2 = 05;
        Post post2 = new Post(moment2, title2, content2, likes2);
        List<Comment> comments2 = new ArrayList<>();
        Comment commment3 = new Comment("Good night");
        Comment commment4 = new Comment("May the Force be with you");
        post2.getComments().add(commment3);
        post2.getComments().add(commment4);

        System.out.println(post1);
        System.out.println(post2);

    }
}
