package com.liucw.resumeGenerator.controller;


import com.liucw.resumeGenerator.common.ResponseModel;
import com.liucw.resumeGenerator.entity.User;
import com.liucw.resumeGenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/user")
@CrossOrigin(origins = "${liucw.web.path}", allowedHeaders = "*", allowCredentials = "true")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/insert",method=RequestMethod.POST)
    @ResponseBody
    public ResponseModel createUser(User user){
        return new ResponseModel(userService.insertUser(user));

    }

    @RequestMapping(path = "/test",method=RequestMethod.GET)
    @ResponseBody
    public ResponseModel testUser(){
        return new ResponseModel("????");
    }


}
