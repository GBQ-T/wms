package com.example.wms.service;

import java.util.List;
import java.util.Map;

import com.example.wms.pojo.TStock;

public interface TStockService {
	
    List<TStock> selectStocks(Map<String, Object> map);

}
