package com.jfreedom.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String searchName(HttpServletRequest httpRequest,HttpSession session){


		String name = httpRequest.getParameter("name");
		if(name == null){
			httpRequest.setAttribute("loi tìm kiem", "dien tên muon tìm");
		}else {


			List<Shop> shopListsearch = shopService.searchName(name);
			session.setAttribute("searchName",shopListsearch);




		}
		return "searchname";
	}*/
	@RequestMapping(value = "/saveShop",method = RequestMethod.GET)
	public String saveShop(HttpServletRequest request,Model model){

		Shop shop = new Shop();

		shop = shopService.saveShop();
		if(shop.getId()!= 4){
			request.setAttribute("loi ket noi","kiem tra lai");
		}
		else



		model.addAttribute("saveShop",shop);
		return "saveSusscess";

	}
	@RequestMapping(value = "deleteById",method = RequestMethod.GET)
	public String deleteShop(){


		shopService.deleteShop();
		return "listShopView";
	}
	@RequestMapping(value = "/deleteOBject",method = RequestMethod.GET)
	public String deleteObject(){


		shopService.deleObject();
		return "listShopView";
	}
}
