package com.example.wms.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.wms.mapper.TStockMapper;
import com.example.wms.pojo.TStock;
import com.example.wms.service.TStockService;

@Service
public class TStockServiceImpl implements TStockService{
	
    @Autowired
    private TStockMapper tStockMapper;

	@Override
	public List<TStock> selectStocks(Map<String, Object> map) {
		return tStockMapper.selectStocks(map);
	}

}
