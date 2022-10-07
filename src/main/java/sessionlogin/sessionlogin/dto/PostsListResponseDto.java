package sessionlogin.sessionlogin.dto;

import lombok.Getter;
import sessionlogin.sessionlogin.model.Posts;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    // private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        // this.content = entity.getContent();
        this.author = entity.getAuthor();
        // this.modifiedDate = entity.getModifiedDate();
    }
}