package com.springdemo.oms.controller;


import com.springdemo.oms.entity.Portfolios;
import com.springdemo.oms.service.PortfoliosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PortfolioController {

    private PortfoliosService portfoliosService;

    public PortfolioController(PortfoliosService portfoliosService) {
        super();
        this.portfoliosService = portfoliosService;
    }

    //handler method to handle list of portfolios and return mode and view
    @GetMapping("/portfolios")
    public String listPortfolios(Model model){

        model.addAttribute("portfolios",portfoliosService.getAllPortfolios());
        return "portfolios";

    }
    @GetMapping("/portfolios/new")
    public String createPortfolios(Model model){


        //Create portfolio object to hold portfolio data
        Portfolios portfolios = new Portfolios();
        model.addAttribute("portfolios",portfolios);
        return "create_portfolios";

    }

   @PostMapping("/portfolios")
    public String savePortfolio(@ModelAttribute("portfolios") Portfolios portfolios){
        portfoliosService.savePortfolio(portfolios);
        return "redirect:/portfolios";
   }
}
