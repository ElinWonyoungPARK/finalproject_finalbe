package org.cart.api.uss.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@ToString
@Entity @Getter
@Table(name = "users")
public class UserVo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_num") private long userNum;
    @Column private String userid;
    @Column private String password;
    @Column private String username;
    @Column private String email;
    @Column private String gender;
    @Column private String birthday;
    @Column(name = "phone_number") private String phoneNumber;
    @Column private String admin;
    @Column(name = "prefer_genre") private String preferGenre;


}
