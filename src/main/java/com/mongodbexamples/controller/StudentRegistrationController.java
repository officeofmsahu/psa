package com.mongodbexamples.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentRegistrationController {
//http://localhost:27017/api/v1/student
    @PostMapping("/addStudent")
    public String addStudentRegistration(){
        return "done";
    }


}
