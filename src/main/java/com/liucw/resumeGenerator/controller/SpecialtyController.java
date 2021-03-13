package com.liucw.resumeGenerator.controller;

import com.liucw.resumeGenerator.common.ResponseModel;
import com.liucw.resumeGenerator.entity.Specialty;
import com.liucw.resumeGenerator.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/specialty")
@CrossOrigin(origins = "${liucw.web.path}", allowedHeaders = "*", allowCredentials = "true")
public class SpecialtyController {
    @Autowired
    private SpecialtyService specialtyService;

    @RequestMapping(path = "/insert" , method= RequestMethod.POST)
    @ResponseBody
    public ResponseModel createSpecialty(Specialty specialty){
        specialtyService.insertSpecialty(specialty);
        return new ResponseModel();
    }
}
