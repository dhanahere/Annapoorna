package com.dhana.Annapoorna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhana.Annapoorna.dao.LoginDao;
import com.dhana.Annapoorna.entity.Login;

@Controller
public class IndexController {
	@Autowired
	LoginDao ldao;	
	Login login;	
	public String home()
	{
		return "index.jsp";
	}
	@RequestMapping("/")
	public String login()
	{
		return "Login.jsp";
	}
	@RequestMapping("checklogin")
	//public String checkLogin(@RequestParam("loginname")String loginName,@RequestParam("password")String password)
	public String checkLogin(@ModelAttribute Login login)
	{
		//login=new Login(loginName,password);
		ldao.checkLogin(login);
		return "index.jsp";
	}

}
