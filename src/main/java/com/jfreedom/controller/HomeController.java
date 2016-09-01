package com.jfreedom.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jfreedom.model.Shop;
import com.jfreedom.service.ShopService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@Autowired
	ShopService shopService;

	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homeHello(@RequestParam("shopname") String name, ModelMap model){
		Shop shop = new Shop();
		shop.setName(name);
		//System.out.println("Name : "+shop.getName());
		model.addAttribute("shop",shop);
		
		return "hello";
	}
	
	@RequestMapping(value="/form", method =RequestMethod.GET)
	public String setupForm( Model model){
		List<Shop> listShops =  shopService.getAllShops();
		for (Shop shop : listShops) {
			System.out.println("shop id" + shop.getId() + "Shop name :"+shop.getName()+" Local: "+shop.getLocal()+" Email : "+shop.getEmail());
		}
		model.addAttribute("allOfShop",listShops);
		return "listShopView";
	}
	@RequestMapping(value = "/findID",method = RequestMethod.GET)
	public String findOne(Model model){
		Shop shop = new Shop();


		 shop = shopService.findOneId();
		model.addAttribute("shop",shop);
		return "findOne";
	}
	/*@RequestMapping(value = "/searchByName")
	public String searchName(@RequestParam(value="name", required=false, defaultValue="World")String name,HttpSession session){



		if(name == null){
			session.setAttribute("l?i tìm ki?m", "?i?n tên mu?n tìm");
		}else {


			List<Shop> shopListsearch = shopService.findByName(name);
			session.setAttribute("searchName",shopListsearch);




		}
		return "seachView";
	}*/
	/*@RequestMapping(value = "/searchByName")
	public String searchNameLike(@RequestParam(value="name", required=false, defaultValue="World")String name,HttpSession session){



		if(name == null){
			session.setAttribute("l?i tìm ki?m", "?i?n tên mu?n tìm");
		}else {


			List<Shop> shopListsearch = shopService.findByNameLike(name);
			session.setAttribute("searchName",shopListsearch);




		}
		return "seachView";
	}*/
/*	@RequestMapping(value = "/searchByName")
	public String searchNameContaining(@RequestParam(value="name", required=false, defaultValue="World")String name,HttpSession session){



		if(name == null){
			session.setAttribute("l?i tìm ki?m", "?i?n tên mu?n tìm");
		}else {


			List<Shop> shopListsearch = shopService.findByNameContaining(name);
			session.setAttribute("searchName",shopListsearch);




		}
		return "seachView";
	}*/
	/*@RequestMapping(value = "/searchByName")
	public String searchNameStartWith(@RequestParam(value="name", required=false, defaultValue="World")String name,HttpSession session){



		if(name == null){
			session.setAttribute("l?i tìm ki?m", "?i?n tên mu?n tìm");
		}else {


			List<Shop> shopListsearch = shopService.findByNameStartingWith(name);
			session.setAttribute("searchName",shopListsearch);




		}
		return "seachView";
	}*/
	/*@RequestMapping(value = "/searchByName")
	public String searchNameEndwith(@RequestParam(value="name", required=false, defaultValue="World")String name,HttpSession session){



		if(name == null){
			session.setAttribute("l?i tìm ki?m", "?i?n tên mu?n tìm");
		}else {


			List<Shop> shopListsearch = shopService.findByNameEndingWith(name);
			session.setAttribute("searchName",shopListsearch);




		}
		return "seachView";
	}*/
	@RequestMapping(value = "/searchByName")
	public String searchNameEgnoreCase(@RequestParam(value="name", required=false, defaultValue="World")String name,HttpSession session){



		if(name == null){
			session.setAttribute("l?i tìm ki?m", "?i?n tên mu?n tìm");
		}else {


			List<Shop> shopListsearch = shopService.findByNameEgnoreCase(name);
			session.setAttribute("searchName",shopListsearch);




		}
		return "seachView";
	}
}
