package com.liucw.resumeGenerator.controller;


import com.liucw.resumeGenerator.common.ResponseModel;
import com.liucw.resumeGenerator.entity.*;
import com.liucw.resumeGenerator.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Controller
@RequestMapping("/v1")
@CrossOrigin(origins = "${liucw.web.path}", allowedHeaders = "*", allowCredentials = "true")
public class InfoController {

    @Autowired
    private UserService userService;

    @Autowired
    private EduService eduService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private WorkService workService;

    @Autowired
    private SpecialtyService specialtyService;

    @RequestMapping(path = "/info",method = RequestMethod.GET)
    @ResponseBody
    public ResponseModel getInfo(@RequestParam("userid") int userId){

        User user = userService.findUserById(userId);
        List<Edu> edu = eduService.findEduByUserId(userId);
        Skill skill = skillService.findSkillByUserId(userId);
        List<Work> work = workService.findWorkByUserId(userId);
        List<Specialty> specialty = specialtyService.findSpecialtyByUserId(userId);
        Info info = new Info(user,edu,skill,work,specialty);
        System.out.println(info.toString());
        ResponseModel result = new ResponseModel(info);
        System.out.println("*****************");
        //跟踪为什么不重写json方法会有问题？
        return result;


    }
}
