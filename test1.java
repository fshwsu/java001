package com.fsh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fsh.pojo.NewStudent;
import com.fsh.pojo.ScoreResult;
import com.fsh.service.StuService;

@Controller
public class StuController {
	
	/**
	 * 返回全部学生信息：支撑柱状图、折线图
	 * 
	 * 返回加工后的学生信息，支撑饼状图
	 * 
	 */
	@Autowired
	StuService stuService;
	
	
	@RequestMapping("/getallstu")
	@ResponseBody
	public List<NewStudent> getAllStu(){
		List<NewStudent> list = stuService.getAllStu();
		System.out.println(list.size());
		
		return list;
	}
	
	@RequestMapping("/getallstupie")
	@ResponseBody
	public List<ScoreResult> getallStuPie(){
		List<ScoreResult> listr = new ArrayList<ScoreResult>();
		List<NewStudent> list = stuService.getAllStu();
		for (NewStudent stu : list) {
			ScoreResult sr = new ScoreResult();
			sr.setName(stu.getName());
			sr.setValue(stu.getScore());
			listr.add(sr);
		}
		
		return listr;
	}
	
	
	
	
}
