package org.cart.api.rev.domain;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Getter @Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="review_num") private int reviewNum;
    @Column(name="review_title") private String reviewTitle;
    @Column(name="review_content") private String reviewContent;
    @Column(name="reg_date") private String regDate;
    @Column(name="score") private String score;

}
