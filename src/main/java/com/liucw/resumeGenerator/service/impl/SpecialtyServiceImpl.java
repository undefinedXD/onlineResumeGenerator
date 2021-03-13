package com.liucw.resumeGenerator.service.impl;

import com.liucw.resumeGenerator.common.BusinessException;
import com.liucw.resumeGenerator.common.ErrorCode;
import com.liucw.resumeGenerator.dao.SpecialtyMapper;
import com.liucw.resumeGenerator.entity.Specialty;
import com.liucw.resumeGenerator.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyServiceImpl implements ErrorCode, SpecialtyService {

    @Autowired
    private SpecialtyMapper specialtyMapper;

    @Override
    public void insertSpecialty(Specialty specialty) {
        try{
            specialtyMapper.insert(specialty);
        }catch (Exception e){
            throw new BusinessException(UNDEFINED_ERROR,"【特长服务】出现未知异常");
        }

    }

    @Override
    public Specialty findSpecialtyById(int id) {
        return specialtyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Specialty> findSpecialtyByUserId(int userId) {
        return specialtyMapper.selectByUserKey(userId);
    }
}
