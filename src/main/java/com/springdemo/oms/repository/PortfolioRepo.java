package com.springdemo.oms.repository;

import com.springdemo.oms.entity.Portfolios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PortfolioRepo extends JpaRepository<Portfolios,Long> {


}
