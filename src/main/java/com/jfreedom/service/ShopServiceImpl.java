package com.jfreedom.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.jfreedom.dao.ShopDAO;
import com.jfreedom.model.Shop;
import com.jfreedom.reponsitory.ShopJPAReponsitoryCustom;




@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	ShopJPAReponsitoryCustom reponsitoryCustom;
	
	// Show all shops in database
	public List<Shop> getAllShops() {
		return reponsitoryCustom.findAll();
	}
	
	// Look for a shop by id
	public  Shop findOneId(){
		return reponsitoryCustom.findOne(2);
	}


	public Shop findShop() {
		
		return reponsitoryCustom.findOne(1);
	}


	// Insert a shop 
	public boolean insert() {
		Shop shop = new Shop();
		shop.setName("Shop4");
		shop.setLocal("Da Nang");
		shop.setEmail("shoponline4@hotmail.com");
		reponsitoryCustom.save(shop);
		return true;
	}
	
	// Delete a shop by id
	public boolean deleteByID() {
		reponsitoryCustom.delete(5);
		return true;
	}
	
	//Delete a object (shop)
	public boolean deleteEntity() {
		Shop shop = new Shop();
		Shop rs = reponsitoryCustom.findOne(5);
		reponsitoryCustom.delete(rs);
		return true;
	}

	public Shop findByNameShop(String name) {
		return reponsitoryCustom.findByName(name);
	}
	
}

	
