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
import com.sun.javafx.sg.prism.NGShape.Mode;


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
	
	@RequestMapping(value="/seach", method=RequestMethod.GET)
	public String findAShop(Model model){
		Shop ashop = new Shop();
		ashop = shopService.findShop();
		System.out.println("shop id"+ashop.getName());
		model.addAttribute("ashop", ashop);
		return "seachView";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insertShop(Model model){
		boolean kq;
		kq= shopService.insert();
		model.addAttribute("kq",kq);
		return "insertShop";
	}
	
	// delete 1 shop co id = 4
	@RequestMapping(value="/deleteId", method=RequestMethod.GET)
	public String deleteID(Model model){
		boolean kq;
		kq = shopService.deleteByID();
		model.addAttribute("kq", kq);
		return"deleteById";
	}
	
	// delete 1 shop (object)
	@RequestMapping(value="/deleteObj", method=RequestMethod.GET)
	public String deleteObj(Model model){
		boolean kq;
		kq = shopService.deleteEntity();
		model.addAttribute("kq", kq);
		return"deleteByObj";
	}
	
	
	@RequestMapping(value = "/findID",method = RequestMethod.GET)
	public String findOne(Model model){
		Shop shop = new Shop();


		 shop = shopService.findOneId();
		model.addAttribute("shop",shop);
		return "findOne";
	}
	
	
	
}
