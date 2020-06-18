package hfyforum.community.dto;

import hfyforum.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private String tag;
    private Integer creator;
    private Integer commentCount;
    private Integer likeCount;
    private Integer viewCount;
    private User user;
}
