package com.springdemo.oms.service.impl;

import com.springdemo.oms.entity.Portfolios;
import com.springdemo.oms.repository.PortfolioRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfoliosService implements com.springdemo.oms.service.PortfoliosService {
    private PortfolioRepo portfolioRepo;

    public PortfoliosService(PortfolioRepo portfolioRepo) {
        this.portfolioRepo = portfolioRepo;
    }

    @Override
    public List<Portfolios> getAllPortfolios() {
        return portfolioRepo.findAll();

    }

    @Override
    public Portfolios savePortfolio(Portfolios portfolios) {
        return portfolioRepo.save(portfolios);

    }




}
