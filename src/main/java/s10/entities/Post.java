package s10.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import s10.entities.Comment;

@Data
@NoArgsConstructor
public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;
    List<Comment> comments = new ArrayList<>();

    public Post(LocalDateTime moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n")
                .append(likes + " Likes - " + moment + "\n")
                .append(content + "\n")
                .append("Comments: \n");
        for(Comment c : comments){
            sb.append(c.getText())
                    .append("\n");
        }
        return sb.toString();
    }

}
