package com.jfreedom.service;

import java.util.List;

import com.jfreedom.model.Shop;
import org.springframework.data.repository.query.Param;

public interface ShopService {

	public List<Shop> getAllShops();
	public  Shop findOneId();
	/*public  List<Shop> findAllArray();*/
	/*List<Shop> searchName( String name);*/
	public Shop saveShop();
	public Boolean deleteShop();
	public Boolean deleObject();
}
