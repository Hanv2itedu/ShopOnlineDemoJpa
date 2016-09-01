package com.jfreedom.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfreedom.model.Shop;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShopJPAReponsitoryCustom extends JpaRepository<Shop, Integer>{

    List<Shop> findByName (String name);
    List<Shop> findByNameLike (String name);
    List<Shop> findByNameContaining (String name);
    List<Shop> findByNameStartingWith(String name);
    List<Shop> findByNameEndingWith(String name);
    List<Shop> findByNameIgnoreCase(String name);



}
