package com.example.wms.service;

import java.util.List;

import com.example.wms.pojo.TStock;

public interface TStockService {
	
    List<TStock> selectStocks(TStock tStock);

}
