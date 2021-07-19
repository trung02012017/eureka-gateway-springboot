package com.example.provinceservice.controllers;

import com.example.provinceservice.entities.Province;
import com.example.provinceservice.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/province")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @GetMapping(value = "/all")
    public Flux<Province> getAllProvince(){return provinceService.getAllProvince();}

    @GetMapping(path = "/id/{provinceId}")
    public Mono<Province> getProvinceById(@PathVariable("provinceId") Integer provinceId){
        return provinceService.getProvinceById(provinceId);
    }

    @GetMapping(path = "/name/{provinceName}")
    public Flux<Province> getProvinceByName(@PathVariable("provinceName") String provinceName){
        return provinceService.getProvinceByName(provinceName);
    }
}
