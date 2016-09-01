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
	public List<Shop> findByName( String name){

		return reponsitoryCustom.findByName(name);

	}
public List<Shop> findByNameLike( String name){

	return reponsitoryCustom.findByNameLike("%" + name + "%");

}
	public  List<Shop> findByNameContaining(String name){

		return reponsitoryCustom.findByNameContaining(name);
	}
	public  List<Shop> findByNameStartingWith(String name){

		return reponsitoryCustom.findByNameContaining(name);
	}
	public  List<Shop> findByNameEndingWith(String name){

		return reponsitoryCustom.findByNameEndingWith(name);
	}
	public  List<Shop> findByNameEgnoreCase(String name){

		return reponsitoryCustom.findByNameIgnoreCase(name);
	}

	
}
