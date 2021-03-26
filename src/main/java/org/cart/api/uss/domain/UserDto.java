package org.cart.api.uss.domain;

import lombok.Data;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component @Lazy @Data
public class UserDto {
    private long userNum;
    private String userid;
    private String password;
    private String username;
    private String email;
    private String gender;
    private String birthday;
    private String phoneNumber;
    private String preferGenre;

}
