package org.cart.api.rev.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;
@Component @Data @Lazy
public class ReviewDto {
    private int reviewNum;
    private int exhbnNum;
    private int userNum;
    private String reviewTitle;
    private String reviewContent;
    private String regDate;
    private String score;
}
