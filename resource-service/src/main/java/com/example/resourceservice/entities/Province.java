package com.example.resourceservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Province {
    private Integer provinceId;
    private String provinceName;
    private Integer type;
}
