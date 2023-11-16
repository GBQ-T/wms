package com.example.wms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.wms.pojo.TStock;

@Mapper
public interface TStockMapper {

	List<TStock> selectStocks(TStock tStock);
}
