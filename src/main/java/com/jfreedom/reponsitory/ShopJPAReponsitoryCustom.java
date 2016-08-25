package com.jfreedom.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfreedom.model.Shop;

import java.util.List;

public interface ShopJPAReponsitoryCustom extends JpaRepository<Shop, Integer>{
    List<Shop> findByName(String name);

}
