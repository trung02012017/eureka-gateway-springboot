package com.example.resourceservice.controllers;

import com.example.resourceservice.entities.Province;
import com.example.resourceservice.feignService.FeignProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign-service")
public class ProvinceResourceController {
    @Autowired
    private FeignProvinceService feignProvinceService;

    @GetMapping("/all")
    public List<Province> getAllProvince(){
        return feignProvinceService.getAllProvince();
    }

    @GetMapping(value = "/id/{provinceId}")
    public Province getProvinceById(@PathVariable("provinceId") Integer provinceId){
        return feignProvinceService.getProvinceById(provinceId);
    }

    @GetMapping(value = "/name/{provinceName}")
    public List<Province> getProvinceByName(@PathVariable("provinceName") String provinceName){
        return feignProvinceService.getProvinceByName(provinceName);
    }
}
