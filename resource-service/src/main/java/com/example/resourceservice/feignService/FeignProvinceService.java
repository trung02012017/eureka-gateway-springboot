package com.example.resourceservice.feignService;

import com.example.resourceservice.entities.Province;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "province-service")
public interface FeignProvinceService {
    @GetMapping("/province/all")
    List<Province> getAllProvince();

    @RequestMapping(path = "/province/id/{provinceId}")
    Province getProvinceById(@PathVariable("provinceId") Integer provinceId);

    @RequestMapping(path = "province/name/{provinceName}")
    List<Province> getProvinceByName(@PathVariable("provinceName") String provinceName);
}
