package com.jfreedom.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfreedom.model.Shop;

public interface ShopService {

	public List<Shop> getAllShops();

	public Shop findShop();
	public boolean insert();
//	public List<Shop> findArray();

	//public List<Shop> findArrayShop();
	public  Shop findOneId();
	/*public  List<Shop> findAllArray();*/
	/*List<Shop> searchName( String name);*/
}
