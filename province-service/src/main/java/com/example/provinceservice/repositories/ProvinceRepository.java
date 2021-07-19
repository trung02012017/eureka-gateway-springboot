package com.example.provinceservice.repositories;

import com.example.provinceservice.entities.Province;
;
import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public interface ProvinceRepository extends ReactiveCrudRepository<Province, Integer> {
    @Query("select * from Province")
    Flux<Province> getAllProvince();

    @Query("select * from Province p where p.provinceId = :provinceId")
    Mono<Province> getProvinceById(@Param("provinceId") Integer provinceId);

    @Query("select * from Province p where p.provinceName like %:provinceName%")
    Flux<Province> getProvinceByName(@Param("provinceName") String provinceName);
}
