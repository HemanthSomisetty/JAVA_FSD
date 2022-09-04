package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.AdminSer;
import com.simplilearn.demo.Admin;

@RestController
public class MainController {
	
	@Autowired
	AdminSer as;
	
	//http://localhost:8080/adminLogin
		@PostMapping(value="adminLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String adminLogin(@RequestBody Admin u)
		{
				return as.adminLogin(u);
		}
		
		//http://localhost:8080/adminupdate
			@PostMapping(value="adminupdate", consumes = MediaType.APPLICATION_JSON_VALUE)
			public String adminUpdate(@RequestBody Admin u)
			{
					return as.adminupdate(u);
			}

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/user")
    public String protectedHello(){
        return "Welcome User";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Welcome admin";
    }

}