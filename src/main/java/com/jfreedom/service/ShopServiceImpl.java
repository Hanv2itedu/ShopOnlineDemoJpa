package com.jfreedom.service;

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
/*public List<Shop> searchName( String name){

	return reponsitoryCustom.searchName( name);

}*/
	public Shop saveShop(){
		Shop shop = new Shop();
		shop.setId(4);
		shop.setName("quoc");
		shop.setEmail("quoc@gmail.com");
		shop.setLocal("ha noi");


	return reponsitoryCustom.save(shop);



	}
	public Boolean deleteShop(){

		reponsitoryCustom.delete(2);
		return  true;


	}
	public Boolean deleObject(){
		Shop shop = new Shop();
		shop = reponsitoryCustom.findOne(1);

		reponsitoryCustom.delete(shop);
		return  true;


	}
	public List<Shop> findByName(String name){

		return reponsitoryCustom.findByName(name);
	}

	
}
