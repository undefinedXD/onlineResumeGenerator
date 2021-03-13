package com.liucw.resumeGenerator.service.impl;

import com.liucw.resumeGenerator.common.BusinessException;
import com.liucw.resumeGenerator.common.ErrorCode;
import com.liucw.resumeGenerator.dao.WorkMapper;
import com.liucw.resumeGenerator.entity.Work;
import com.liucw.resumeGenerator.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements ErrorCode, WorkService{

    @Autowired
    private WorkMapper workMapper;

    @Override
    public void insertWork(Work work) {
        try{
            workMapper.insert(work);
        }catch(Exception e){
            throw new BusinessException(UNDEFINED_ERROR,"【工作经历】服务出现未知异常");
        }
    }

    @Override
    public Work findWorkById(int id) {
        return workMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Work> findWorkByUserId(int userId) {
        return workMapper.selectByUserKey(userId);
    }
}
