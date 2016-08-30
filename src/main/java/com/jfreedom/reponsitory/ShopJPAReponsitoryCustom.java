package com.jfreedom.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfreedom.model.Shop;

public interface ShopJPAReponsitoryCustom extends JpaRepository<Shop, Integer>{

	//List<Shop> findAll(int i, int j);

	//public Shop findShop();
	
    /*List<Shop> searchName(@Param("name") String name);*/



}
