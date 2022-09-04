package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.Admin;

import com.simplilearn.demo.AdminRepo;
import com.simplilearn.demo.QuestionsRepo;
import com.simplilearn.demo.QuizRepo;


@Service
public class AdminSer {
	@Autowired
	QuestionsRepo qr;
	@Autowired
	QuizRepo qur;
	@Autowired
//	Userrepo ur;
//	@Autowired
//	Statistics stat;
//	@Autowired
	AdminRepo adr;
	
	
	
	public String adminLogin(Admin u)
	{
		Admin ad= adr.findById(1).get();
		if(u.getUsername().equals(ad.getUsername())&&u.getPassword().equals(ad.getPassword()))
		{
			return "Welcome admin";
		}
		else
		{
			return "invalid Credentials";
		}
	}
	public String adminupdate(Admin a)
	{
		Admin ad= adr.findById(1).get();
		ad.setUsername(a.getUsername());
		ad.setPassword(a.getUsername());
		adr.saveAndFlush(ad);
			return "Updated";
	

	}
	
	
}