package com.myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.spring.model.Category;
import com.websystique.spring.model.Order;
import com.websystique.spring.model.OrderDetail;
import com.websystique.spring.model.Product;
import com.websystique.spring.model.User;
import com.websystique.spring.service.BillService;
import com.websystique.spring.service.CategoryService;
import com.websystique.spring.service.OrderService;
import com.websystique.spring.service.ProductService;
import com.websystique.spring.service.UserService;

@Controller
public class AdminController {
	
/*	Vu Huy Loc PM181 */
	
	
	@Autowired
	private ProductService proService;
	@Autowired
	private UserService uService;
	@Autowired
	private CategoryService cateService;
	@Autowired
	private OrderService oService;
	@Autowired
	private BillService bService;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home(ModelMap model) {
		List<Product> product = this.proService.findAll();
		model.addAttribute("product", product);
		return "manager"; 
	} 
	@RequestMapping(value = "/u", method = RequestMethod.GET)
	public String u(ModelMap model) {
		List<User> u = this.uService.findAll();
		model.addAttribute("u", u);
		return "um"; 
	}
	@RequestMapping(value = "/editss-{productId}/home", method = RequestMethod.POST)
	public String homedit(ModelMap model, @RequestParam("name") String name, @RequestParam("price") int price
			, @RequestParam("discount") int discount, @RequestParam("amount") int amount
			, @RequestParam("text") String description, @RequestParam("type") Long type
			, @RequestParam("image") String image, @PathVariable("productId") Long id) {
		Product productVO = new Product(id,name,price,discount,amount,description,image,type);
		
		proService.update(productVO);
		
		List<Product> product = this.proService.findAll();
		model.addAttribute("product", product);
		return "manager"; 
	} 
	
	@RequestMapping(value = "/editu{u.id}/home", method = RequestMethod.POST)
	public String homedit(ModelMap model, @RequestParam("email") String email, @RequestParam("user") String username
			, @RequestParam("pass") String password, @RequestParam("type") int role, @PathVariable("u.id") Long id) {
		User productVO = new User(id, username, password, role, email);
		
		uService.update(productVO);
		
		List<User> u = this.uService.findAll();
		model.addAttribute("u", u);
		return "um";  
	} 
	@RequestMapping(value = "/addss/home", method = RequestMethod.POST)
	public String homedd(ModelMap model, @RequestParam("name") String name, @RequestParam("price") int price
			, @RequestParam("discount") int discount, @RequestParam("amount") int amount
			, @RequestParam("text") String description, @RequestParam("type") Long type
			, @RequestParam("image") String image) {
		Product productVO = new Product(name,price,discount,amount,description,image,type);
		
		Product productDB = proService.save(productVO);
		
		List<Product> product = this.proService.findAll();
		model.addAttribute("product", product);
		return "manager"; 
	} 
	@RequestMapping(value = "/delss-{productId}/home", method = RequestMethod.GET)
	public String homedd(ModelMap model, @PathVariable("productId") Long id) {
		
		proService.delete(id);
		
		List<Product> product = this.proService.findAll();
		model.addAttribute("product", product);
		return "manager"; 
	} 
	@RequestMapping(value = "/delu{item.Id}/u", method = RequestMethod.GET)
	public String udd(ModelMap model, @PathVariable("item.Id") Long id) {
		
		uService.delete(id);
		
		List<User> u = this.uService.findAll();
		model.addAttribute("u", u);
		return "um";  
	} 
	
	@RequestMapping(value = "/invoice-list", method = RequestMethod.GET)
	public String invoicelist(ModelMap model) {
		List<Order> o = this.oService.findAll();
		model.addAttribute("o", o);
		return "invoice-list"; 
	}
	@RequestMapping(value = "/invoice-details-{id}", method = RequestMethod.GET)
	public String invoicedetails(ModelMap model, @PathVariable("id") Long id) {
		List<OrderDetail> od = this.bService.findId_bill(id);
		Order o = this.oService.findById(id);
		model.addAttribute("od", od);
		model.addAttribute("o", o);
		return "invoice-details"; 
	}
	
	@RequestMapping(value = "/e-{itemid}/edit-product", method = RequestMethod.GET)
	public String editproduct(ModelMap model, @PathVariable("itemid") Long productId) {
		Product product =  this.proService.findById(productId);
		List <Category> cate =  this.cateService.findAll();
		model.addAttribute("product", product);
		model.addAttribute("cate", cate);
		return "edit-product";
	}
	
	@RequestMapping(value = "/eu{item.id}", method = RequestMethod.GET)
	public String editu(ModelMap model, @PathVariable("item.id") Long productId) {
		User product =  this.uService.findById(productId);
		model.addAttribute("u", product);
		return "edit-u";
	}
	
	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public String addproduct(ModelMap model) {
		List <Category> cate =  this.cateService.findAll();
		model.addAttribute("cate", cate);
		return "add-product"; 
	}
}
