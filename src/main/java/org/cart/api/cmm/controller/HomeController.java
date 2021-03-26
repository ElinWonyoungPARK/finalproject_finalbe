package org.cart.api.cmm.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/")
    public String index() {
        return String.format("<h1>Web Server Started At %s </h1>",
                new SimpleDateFormat("MM-DD HH:mm").format(new Date()));
    }

}
