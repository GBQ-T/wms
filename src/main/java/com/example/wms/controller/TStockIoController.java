package com.example.wms.controller;


import com.example.wms.pojo.TStockIo;
import com.example.wms.service.impl.TStockIoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stockIo")
public class TStockIoController {

    @Autowired
    TStockIoServiceImpl stockIoService;


    @GetMapping("/list")
    public List<TStockIo> selectAll(TStockIo tStockIo){
       return stockIoService.selectAll(tStockIo);
    }

    @GetMapping("/stockMsg")
    public List<TStockIo> selectStockMsg(TStockIo tStockIo){
       return stockIoService.selectAll(tStockIo);
    }
}
