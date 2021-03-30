package com.myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.spring.model.Category;
import com.websystique.spring.model.Product;
import com.websystique.spring.model.User;
import com.websystique.spring.service.CategoryService;
import com.websystique.spring.service.ProductService;
import com.websystique.spring.service.UserService;

@Controller
public class StartfirstController {
	
	/*	Vu Huy Loc PM181 */
	
	@Autowired
	private UserService uService;
	@Autowired
	private CategoryService cateService;
	@Autowired
	private ProductService proService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(ModelMap model) {
		model.addAttribute("msg", "login");
		return "login"; 
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(ModelMap model) {
		model.addAttribute("msg", "signup");
		return "signup"; 
	}
	
	@RequestMapping(value = "/signining", method = RequestMethod.POST)
	public String lgin(ModelMap model, @RequestParam("email") String name, @RequestParam("pass") String pass) {
		User u = this.uService.findByemail(name);
		if (u != null) {
			if(!u.getEmail().equals(name)||!u.getPassword().equals(pass)) {
				model.addAttribute("err", "Email or Password was wrong!!! Please try again");
				return "login"; 
			} else {
				if(u.getRole()==0) {
					List<Category> cate =  cateService.findAll();
					model.addAttribute("cate", cate);
					return "home"; 
				} else {
					List<Product> product = this.proService.findAll();
					model.addAttribute("product", product);
					return "manager"; 
				}
			}
		} else {
			model.addAttribute("err", "Email or Password was wrong!!! Please try again");
			return "login"; 
		}
		
	}
	
	@RequestMapping(value = "/signuping", method = RequestMethod.POST)
	public String sup(ModelMap model, @RequestParam("email") String email, @RequestParam("password1") String pass
			, @RequestParam("password2") String pass2, @RequestParam("Username") String username) {
		List <User> u = this.uService.findAll();
		boolean check=true;
		if (!pass.equals(pass2)) {
			model.addAttribute("errp", "You did not enter the same new password twice!!! Please try again");
			check=false;
		} else {
			for (User i:u) {
					if (i.getEmail().equals(email)) {
						model.addAttribute("erre", "This email already exists!!! Please try again");
						check=false;
					} else {
						if (i.getUsername().equals(username)) {
							model.addAttribute("erru", "This username already exists!!! Please try again");
							check=false;
						}
					}
			}
		}
		if (check) {
			User userVO = new User();
			userVO.setUsername(username);
			userVO.setEmail(email);
			userVO.setPassword(pass);
			userVO.setRole(0);
			
			User productDB = uService.save(userVO);
			model.addAttribute("ok", "Thank you");
			return "login";
		} else {
			return "signup";
		}
		
	}
}
