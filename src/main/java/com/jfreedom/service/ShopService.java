package com.jfreedom.service;

import java.util.List;

import com.jfreedom.model.Shop;
import org.springframework.data.repository.query.Param;

public interface ShopService {

	public List<Shop> getAllShops();
	public  Shop findOneId();
	/*public  List<Shop> findAllArray();*/
	public List<Shop> findByName( String name);
}
