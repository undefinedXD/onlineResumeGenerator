package com.liucw.resumeGenerator.service.impl;

import com.liucw.resumeGenerator.common.BusinessException;
import com.liucw.resumeGenerator.common.ErrorCode;
import com.liucw.resumeGenerator.dao.EduMapper;
import com.liucw.resumeGenerator.entity.Edu;
import com.liucw.resumeGenerator.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EduServiceImpl implements EduService, ErrorCode {

    @Autowired
    private EduMapper eduMapper;

    @Override
    public void insertEdu(Edu edu) {
        try{
            eduMapper.insert(edu);
        }catch(Exception e){
            throw new BusinessException(UNDEFINED_ERROR,"【教育经历】服务出现未知异常");
        }
    }

    @Override
    public Edu findEduById(int id) {
        return eduMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Edu> findEduByUserId(int userId) {
        return eduMapper.selectByUserKey(userId);
    }
}
