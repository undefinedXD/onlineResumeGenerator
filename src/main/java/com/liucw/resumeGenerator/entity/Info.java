package com.liucw.resumeGenerator.entity;

import java.util.List;
import java.util.Objects;

public class Info {
    private User user;
    private List<Edu> edu;
    private Skill skill;
    private List<Work> work;
    private List<Specialty> specialty;

    public Info(){

    }

    public Info(User user, List<Edu> edu, Skill skill, List<Work> work, List<Specialty> specialty) {
        this.user = user;
        this.edu = edu;
        this.skill = skill;
        this.work = work;
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Info info = (Info) o;
        return Objects.equals(user, info.user) &&
                Objects.equals(edu, info.edu) &&
                Objects.equals(skill, info.skill) &&
                Objects.equals(work, info.work) &&
                Objects.equals(specialty, info.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, edu, skill, work, specialty);
    }

    @Override
    public String toString() {
        return "Info{" +
                "user=" + user +
                ", edu=" + edu +
                ", skill=" + skill +
                ", work=" + work +
                ", specialty=" + specialty +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Edu> getEdu() {
        return edu;
    }

    public void setEdu(List<Edu> edu) {
        this.edu = edu;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public List<Work> getWork() {
        return work;
    }

    public void setWork(List<Work> work) {
        this.work = work;
    }

    public List<Specialty> getSpecialty() {
        return specialty;
    }

    public void setSpecialty(List<Specialty> specialty) {
        this.specialty = specialty;
    }
}
