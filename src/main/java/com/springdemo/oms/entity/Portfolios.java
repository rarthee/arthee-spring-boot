package com.springdemo.oms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "oms")
public class Portfolios{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "portfolioNo", nullable = false)
    private String portfolioNo;

    @Column(name = "portfolioName", nullable = false)
    private String portfolioName;

    @Column(name = "portfolioType", nullable = false)
    private String portfolioType;



    public String getPortfolioNo() {
        return portfolioNo;
    }

    public void setPortfolioNo(String portfolioNo) {
        this.portfolioNo = portfolioNo;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public void setPortfolioType(String portfolioType) {
        this.portfolioType = portfolioType;
    }



    public Portfolios(){

    }
    public Portfolios(String PortfolioNo, String portfolioName, String portfolioType) {
        this.portfolioNo = PortfolioNo;
        this.portfolioName = portfolioName;
        this.portfolioType = portfolioType;
    }


}