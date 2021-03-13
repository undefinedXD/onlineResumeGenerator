package com.liucw.resumeGenerator.service.impl;

import com.liucw.resumeGenerator.common.BusinessException;
import com.liucw.resumeGenerator.common.ErrorCode;
import com.liucw.resumeGenerator.dao.SkillMapper;
import com.liucw.resumeGenerator.entity.Skill;
import com.liucw.resumeGenerator.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService, ErrorCode {

    @Autowired
    private SkillMapper skillMapper;

    @Override
    public void insertSkill(Skill skill) {
        try{
            skillMapper.insert(skill);
        }catch(Exception e){
            throw new BusinessException(UNDEFINED_ERROR,"【技能服务】出现未知异常");
        }
    }

    @Override
    public Skill findSkillById(int id) {
        return skillMapper.selectByPrimaryKey(id);
    }

    @Override
    public Skill findSkillByUserId(int userId) {
        return skillMapper.selectByUserKey(userId);
    }
}
