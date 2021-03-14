package com.liucw.resumeGenerator.controller;


import com.liucw.resumeGenerator.common.ErrorCode;
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
public class UserController implements ErrorCode {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/insert",method=RequestMethod.POST)
    @ResponseBody
    public ResponseModel createUser(User user){
        if(user.getName()==""){
            return new ResponseModel(ResponseModel.STATUS_FAILURE,"名字不能为空！请返回上一步重新生成");
        }

        return new ResponseModel(userService.insertUser(user));

    }

    @RequestMapping(path = "/test",method=RequestMethod.GET)
    @ResponseBody
    public ResponseModel testUser(){
        return new ResponseModel("????");
    }


}
