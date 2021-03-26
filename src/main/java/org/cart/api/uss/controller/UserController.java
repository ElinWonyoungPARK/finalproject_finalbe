package org.cart.api.uss.controller;


import lombok.RequiredArgsConstructor;
import org.cart.api.cmm.controller.AbstractController;
import org.cart.api.uss.domain.UserDto;
import org.cart.api.uss.domain.UserVo;
import org.cart.api.uss.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController @CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/users") @RequiredArgsConstructor
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired UserServiceImpl service;

    @PostMapping("")
    public ResponseEntity<String> save(@RequestBody UserVo user) {
        System.out.print("등록정보: "+user.toString());
        service.save(user);
        return ResponseEntity.ok("success");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(
            @PathVariable Long id,
            @RequestBody UserVo user) {
        service.update(user);
        return ResponseEntity.ok("success");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(
            @PathVariable String id,
            @RequestBody UserVo user) {
        return ResponseEntity.ok("success");
    }
    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(service.count());
    }
    @GetMapping("")
    public ResponseEntity<List<UserVo>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<UserVo> getOne(@PathVariable long id) {
        return ResponseEntity.ok(service.getOne(id));
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<UserVo>> findById(@PathVariable long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> existsById(@PathVariable long id) {
        return ResponseEntity.ok(service.existsById(id));
    }
}
