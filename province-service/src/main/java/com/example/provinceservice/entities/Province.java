package com.example.provinceservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("Province")
public class Province {

    @Id
    @Column(value = "ProvinceId")
    private Integer provinceId;

    @Column(value = "Name")
    private String provinceName;

    @Column(value = "Type")
    private Integer type;
}
