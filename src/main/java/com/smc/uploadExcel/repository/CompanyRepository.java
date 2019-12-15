package com.smc.uploadExcel.repository;

import com.smc.uploadExcel.entity.CompanyEntity;
import com.smc.uploadExcel.entity.StockPriceEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {

	@Query(name = "getCompanyNameByCode", nativeQuery = true, value = "SELECT companyname from company where companycode = :companyCode")
	String getCompanyNameByCode(String companyCode);
}

