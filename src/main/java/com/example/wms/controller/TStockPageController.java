package com.example.wms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TStockPageController {
	
	@RequestMapping("/tStock")
    public String tStock(){
        //classpath:/templates/test.html
        return "tStock";
    }
}
