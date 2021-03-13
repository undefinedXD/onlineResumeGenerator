package com.liucw.resumeGenerator.service;

import com.liucw.resumeGenerator.entity.Work;

import java.util.List;

public interface WorkService {
    void insertWork(Work work);

    Work findWorkById(int id);

    List<Work> findWorkByUserId(int userId);
}