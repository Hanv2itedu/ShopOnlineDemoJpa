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
}
