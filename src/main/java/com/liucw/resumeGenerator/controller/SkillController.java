package com.liucw.resumeGenerator.controller;


import com.liucw.resumeGenerator.common.ResponseModel;
import com.liucw.resumeGenerator.entity.Skill;
import com.liucw.resumeGenerator.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/skill")
@CrossOrigin(origins = "${liucw.web.path}", allowedHeaders = "*", allowCredentials = "true")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @RequestMapping(path = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public ResponseModel createSkill(Skill skill){
        skillService.insertSkill(skill);
        return new ResponseModel();
    }
}
