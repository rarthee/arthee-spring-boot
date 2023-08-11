package com.springdemo.oms.service;

import com.springdemo.oms.entity.Portfolios;

import java.util.List;

public interface PortfoliosService {

    List<Portfolios> getAllPortfolios();

    Portfolios savePortfolio(Portfolios portfolios);
}
