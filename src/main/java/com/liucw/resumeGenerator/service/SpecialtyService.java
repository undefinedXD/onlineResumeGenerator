package com.liucw.resumeGenerator.service;

import com.liucw.resumeGenerator.entity.Specialty;

import java.util.List;

public interface SpecialtyService {
    void insertSpecialty(Specialty specialty);
    Specialty findSpecialtyById(int id);
    List<Specialty> findSpecialtyByUserId(int userId);
}
