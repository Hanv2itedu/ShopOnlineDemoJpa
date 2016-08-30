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
	//ShopDAO dao;
	ShopJPAReponsitoryCustom reponsitoryCustom;
	
	
	public List<Shop> getAllShops() {
		
		//return dao.getAllShops();
		return reponsitoryCustom.findAll();
	}
	public  Shop findOneId(){

		return reponsitoryCustom.findOne(2);
	}
	/*public List<Shop> findAllArray(){
		return  reponsitoryCustom.
	}*/
/*
public List<Shop> searchName( String name){

	return reponsitoryCustom.searchName( name);

}
*/


	public Shop findShop() {
		
		return reponsitoryCustom.findOne(1);
	}


	public boolean insert() {
		Shop shop = new Shop();
		shop.setName("Shop4");
		shop.setLocal("Da Nang");
		shop.setEmail("shoponline4@hotmail.com");
		reponsitoryCustom.save(shop);
		return true;
		
	}

/*
	public List<Shop> findArrayShop() {
		int[] array = {2,3};
		List<Shop> listShop = new  ArrayList<Shop>();
		Shop s = new Shop();
		for (int i : array) {
			s = reponsitoryCustom.findOne(i);
			System.out.println("shop id" + s.getId() + "Shop name :"+s.getName()+" Local: "+s.getLocal()+" Email : "+s.getEmail());
			listShop.add(s);
		}		
		return listShop ;
	}*/
}

	
