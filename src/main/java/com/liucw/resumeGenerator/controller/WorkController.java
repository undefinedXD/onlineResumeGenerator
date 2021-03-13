package com.liucw.resumeGenerator.controller;


import com.liucw.resumeGenerator.common.ResponseModel;
import com.liucw.resumeGenerator.entity.Work;
import com.liucw.resumeGenerator.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/work")
@CrossOrigin(origins = "${liucw.web.path}", allowedHeaders = "*", allowCredentials = "true")
public class WorkController {
    @Autowired
    private WorkService workService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public ResponseModel createWork(Work work){
        workService.insertWork(work);
        return new ResponseModel();
    }

}
