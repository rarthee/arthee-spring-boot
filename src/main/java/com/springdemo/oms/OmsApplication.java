package com.springdemo.oms;

import com.springdemo.oms.entity.Portfolios;
import com.springdemo.oms.repository.PortfolioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OmsApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OmsApplication.class, args);
	}

	@Autowired
	private PortfolioRepo portfolioRepo;

	@Override
	public void run(String... args) throws Exception {
		/*Portfolios portfolio1 = new Portfolios("00001","Pname_0001","DBU");
		portfolioRepo.save(portfolio1);

		Portfolios portfolio2 = new Portfolios("00002","Pname_0002","OBU");
		portfolioRepo.save(portfolio2);

		Portfolios portfolio3 = new Portfolios("00003","Pname_0003","DBU");
		portfolioRepo.save(portfolio3);*/

	}
}
