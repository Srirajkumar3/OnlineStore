package com.raj.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.controller.pojo.NumbersRequest;

@RestController
@RequestMapping("/api")
public class AddController {

   
    @PostMapping("/add")
    public int addPost(@RequestBody NumbersRequest request) {
        int sum = request.getNum1() + request.getNum2();
        System.out.println("Sum of numbers num1 and num2 is : " + sum);
        return sum;
    }
}