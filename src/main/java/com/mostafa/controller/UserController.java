package com.mostafa.controller;

import com.mostafa.model.User;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.controller.UserController.java: SpringBootPassay-PasswordValidation
 * @CreationDate 3/5/2023 2:45 PM
 */
@RestController
@RequestMapping("/")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class UserController {

    @PostMapping("/signIn")
    public ResponseEntity<Object> signIn(@RequestBody @Valid User user){
        Map<String, String> map = new HashMap<>();
        map.put("code", "0");
        map.put("message", "Login Successfully.");

        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}
