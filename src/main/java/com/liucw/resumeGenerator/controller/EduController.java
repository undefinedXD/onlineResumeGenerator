package com.liucw.resumeGenerator.controller;

import com.liucw.resumeGenerator.common.ResponseModel;
import com.liucw.resumeGenerator.entity.Edu;
import com.liucw.resumeGenerator.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/v1/edu")
@CrossOrigin(origins = "${liucw.web.path}", allowedHeaders = "*", allowCredentials = "true")
public class EduController {
    @Autowired
    private EduService eduService;

    @RequestMapping(path = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public ResponseModel createEdu(Edu edu){
        eduService.insertEdu(edu);
        return new ResponseModel();
    }
}
