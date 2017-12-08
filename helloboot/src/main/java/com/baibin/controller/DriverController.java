package com.baibin.controller;

import com.baibin.domain.CarDriver;
import com.baibin.service.CarDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/driver")
@RestController
public class DriverController {
    @Autowired
    private CarDriverService carDriverService;

    @RequestMapping("/findAll")
    public List<CarDriver> findAll() {
        return carDriverService.findAll();
    }
}
