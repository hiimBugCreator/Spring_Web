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
import com.websystique.spring.service.BillService;
import com.websystique.spring.service.CategoryService;
import com.websystique.spring.service.OrderService;
import com.websystique.spring.service.ProductService;

@Controller
public class HomeController {

	/*	Vu Huy Loc PM181 */
	
	@Autowired
	private CategoryService cateService;
	@Autowired
	private BillService billService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductService proService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(ModelMap model) {
		List<Category> cate =  cateService.findAll();
		model.addAttribute("cate", cate);
		return "home"; 
	}
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String contact(ModelMap model) {
		List<Product> product = this.proService.findAll();
		model.addAttribute("product", product);
		return "shop"; 
	}
	
	@RequestMapping(value = "/shopdis", method = RequestMethod.GET)
	public String dis(ModelMap model) {
		List<Product> product = this.proService.findDis();
		model.addAttribute("product", product);
		return "shop"; 
	}
	
	@RequestMapping(value = "/product-detail-{productId}/shop", method = RequestMethod.GET)
	public String shop(ModelMap model, @PathVariable("productId") Long productId) {
		List<Product> product = this.proService.findByType(productId);
		model.addAttribute("product", product);
		return "shop"; 
	}
	
	@RequestMapping(value = "/search-{productName}/shop", method = RequestMethod.POST)
	public String shop(ModelMap model, @RequestParam("search") String name) {
		List<Product> product = this.proService.findByName(name);
		model.addAttribute("product", product);
		return "shop"; 
	}

	@RequestMapping(value = "/detail-{itemid}", method = RequestMethod.GET)
	public String productdetails(ModelMap model, @PathVariable("itemid") Long productId) {
		Product product =  this.proService.findById(productId);
		model.addAttribute("product", product);
		return "product-details"; 
	}
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String Cart(ModelMap model) {
		List<Order> o = orderService.findAll();
		Long id_bill=0L;
		
		for(Order x : o) {
			if(x.getId()>id_bill) {
				id_bill=x.getId();
			}
		}
		id_bill++;
		System.out.println(id_bill);
		List<OrderDetail> oo = billService.findId_bill(id_bill);
		model.addAttribute("list", oo);
		return "cart"; 
	}
	
	@RequestMapping(value = "/checkoutsess{t}", method = RequestMethod.GET)
	public String checkout(ModelMap model, @PathVariable("t") Long mo) {
		model.addAttribute("x", mo);
		return "checkout"; 
	}
	@RequestMapping(value = "/tks{x}", method = RequestMethod.POST)
	public String tks(ModelMap model, @RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("email") String email,
			@RequestParam("country") String country,@RequestParam("addr") String addr,@RequestParam("comment") String note,@PathVariable("x") int n) {
		Order odrVO = new Order( name, addr+", "+country, phone, email, n, note);
		orderService.save(odrVO);
		return "tks"; 
	}
	
	@RequestMapping(value = "/add{no}tocart-{item.id}", method = RequestMethod.GET)
	public String atc(ModelMap model,  @PathVariable("no") int i, @PathVariable("item.id") Long id) {
		Product p = this.proService.findById(id);
		if (i<=p.getAmount()) {
		List<Order> o = orderService.findAll();
		Long id_bill=0L;
		for(Order x : o) {
			if(x.getId()>id_bill) {
				id_bill=x.getId();
			}
		}
		id_bill++;
		OrderDetail odVO = new OrderDetail(id_bill, id, i, (p.getPrice()*(100-p.getDiscount())/100), (p.getPrice()*(100-p.getDiscount())/100)*i,p.getImage(),p.getName());
		OrderDetail odDB = billService.save(odVO);
		Product productVO = new Product(id,p.getName(),p.getPrice(),p.getDiscount(),p.getAmount()-i,p.getDescription(),p.getImage(),p.getType());
		proService.update(productVO);
		}
		
		List<Product> product = this.proService.findAll();
		model.addAttribute("product", product);
		return "shop"; 
	}
	@RequestMapping(value = "/addcart-{item.id}", method = RequestMethod.POST)
	public String atcc(ModelMap model, @PathVariable("item.id") Long id, @RequestParam("qty") int i) {
		Product p = this.proService.findById(id);
		if (i<=p.getAmount()) {
		List<Order> o = orderService.findAll();
		Long id_bill=0L;
		for(Order x : o) {
			if(x.getId()>id_bill) {
				id_bill=x.getId();
			}
		}
		id_bill++;
		OrderDetail odVO = new OrderDetail(id_bill, id, i, (p.getPrice()*(100-p.getDiscount())/100), (p.getPrice()*(100-p.getDiscount())/100)*i,p.getImage(),p.getName());
		OrderDetail odDB = billService.save(odVO);
		Product productVO = new Product(id,p.getName(),p.getPrice(),p.getDiscount(),p.getAmount()-i,p.getDescription(),p.getImage(),p.getType());
		proService.update(productVO);
		}
		
		List<Product> product = this.proService.findAll();
		model.addAttribute("product", product);
		return "shop"; 
	}
}
