package com.liucw.resumeGenerator.service;

import com.liucw.resumeGenerator.entity.Skill;

public interface SkillService {
    void insertSkill(Skill skill);
    Skill findSkillById(int id);

    Skill findSkillByUserId(int userId);
}
