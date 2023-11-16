package com.example.wms.mapper;

import com.example.wms.pojo.TStockIo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TStockIoMapper{

    List<TStockIo> selectAll(TStockIo tStockIo);

}
