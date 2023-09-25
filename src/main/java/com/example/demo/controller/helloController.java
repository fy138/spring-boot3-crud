package com.example.demo.controller;

import com.example.demo.dao.entries.TUser;
import com.example.demo.dao.tuserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class helloController {
    @Autowired
    tuserDAO dao;

    @GetMapping("/user/{id}")
    public Optional<TUser> hello(@PathVariable("id") Long id) {
        TUser user = dao.getUserid(id);
        System.out.println(user.toString());
        return Optional.of(user);
    }

    @GetMapping("/userone/{id}")
    public Optional<TUser> userone(@PathVariable("id") Long id) {
        return dao.findById(id);
    }

    @GetMapping("/users")
    public List<TUser> userall() {
        return dao.findAll();
    }

    @PostMapping("/user/create")
    public String createUser(@RequestBody TUser user) {

        dao.save(user);
        return "{\"status\":\"ok\"}";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        dao.deleteById(id);
        return "{\"status\":\"deleted\"}";
    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable("id") Long id, @RequestBody TUser user) {
        TUser orguser = dao.getUserid(id);
        user.setId(orguser.getId());
        dao.save(user);
        return "{\"status\":\"updated\"}";
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(@RequestParam("name") String name) {
        if (!name.equals("fy")) {
            throw new RuntimeException("not fy");
        }
        return ResponseEntity.ok("hello world!");
    }
}
