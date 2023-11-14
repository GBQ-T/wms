package com.example.wms.service.impl;

import com.example.wms.mapper.TStockIoMapper;
import com.example.wms.pojo.TStockIo;
import com.example.wms.service.TStockIoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TStockIoServiceImpl implements TStockIoService {

    @Autowired
    private TStockIoMapper tStockIoMapper;

    @Override
    public List<TStockIo> selectAll(TStockIo tStockIo) {
        return tStockIoMapper.selectAll(tStockIo);
    }

}
