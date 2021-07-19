package com.example.provinceservice.services;

import com.example.provinceservice.entities.Province;
import com.example.provinceservice.repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    public Flux<Province> getAllProvince(){return provinceRepository.getAllProvince();};

    public Mono<Province> getProvinceById(Integer provinceId){return provinceRepository.getProvinceById(provinceId);};

    public Flux<Province> getProvinceByName(String provinceName){return provinceRepository.getProvinceByName(provinceName);};
}
