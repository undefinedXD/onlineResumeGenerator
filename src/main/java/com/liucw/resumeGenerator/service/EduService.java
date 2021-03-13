package com.liucw.resumeGenerator.service;

import com.liucw.resumeGenerator.entity.Edu;

import java.util.List;

public interface EduService {
    void insertEdu(Edu edu);
    Edu findEduById(int id);

    List<Edu> findEduByUserId(int userId);
}
