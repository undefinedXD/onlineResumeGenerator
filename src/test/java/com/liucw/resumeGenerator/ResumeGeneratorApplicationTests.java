package com.liucw.resumeGenerator;

import com.liucw.resumeGenerator.dao.*;
import com.liucw.resumeGenerator.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ResumeGeneratorApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private WorkMapper workMapper;

	@Autowired
	private EduMapper eduMapper;

	@Autowired
	private SkillMapper skillMapper;

	@Autowired
	private SpecialtyMapper specialtyMapper;

	@Test
	public void testSelect(){
		System.out.println("----- selectAll Method Test");
		List<User> userList = userMapper.selectAll();
		for(User user:userList){
			System.out.println(user.toString());
		}

	}

	@Test
	public void testfindWorkByUserId(){
		System.out.println("----- findWorkByUserId Method Test -----");
		List<Work> work = workMapper.selectByUserKey(48);
		System.out.println(work.toString());
	}

	@Test
	public void testfindEduByUserId(){
		System.out.println("----- findEduByUserId Method Test -----");
		List<Edu> edu = eduMapper.selectByUserKey(48);
		System.out.println(edu.toString());
	}

	@Test
	public void testfindSkillByUserId(){
		System.out.println("----- findSkillByUserId Method Test -----");
		Skill skill = skillMapper.selectByUserKey(48);
		System.out.println(skill.toString());
	}

	@Test
	public void testfindSpecialtyByUserId(){
		System.out.println("----- findSpecialtyByUserId Method Test -----");
//		specialtyMapper.selectByUserKey(45);
		List<Specialty> specialty = specialtyMapper.selectByUserKey(48);
//		System.out.println(specialty.size());
		for(Specialty item:specialty){
			System.out.println(item.toString());
		}
	}

	@Test
	void contextLoads() {
	}

}
