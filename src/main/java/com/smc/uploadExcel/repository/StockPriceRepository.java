package com.smc.uploadExcel.repository;

import com.smc.uploadExcel.entity.StockPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer> {

}

