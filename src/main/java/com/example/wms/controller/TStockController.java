package com.example.wms.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.wms.pojo.TStock;
import com.example.wms.service.impl.TStockServiceImpl;

@Controller
@RequestMapping("/stock")
public class TStockController {
	
    @Autowired
    TStockServiceImpl stockService;
	
	@RequestMapping("/list")
    public String selectStocks(Model model,@RequestParam("queryMap") Map<String, Object> queryMap){
		model.addAttribute("stocks",stockService.selectStocks(queryMap));
        return "tStock";
    }
}
