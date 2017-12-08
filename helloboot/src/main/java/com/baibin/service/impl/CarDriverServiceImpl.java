package com.baibin.service.impl;

import com.baibin.domain.CarDriver;
import com.baibin.mapper.CarDriverMapper;
import com.baibin.service.CarDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carDriverService")
public class CarDriverServiceImpl implements CarDriverService {
    @Autowired
    private CarDriverMapper carDriverMapper;
    @Override
    public List<CarDriver> findAll() {
        return carDriverMapper.selectAll();
    }
}
