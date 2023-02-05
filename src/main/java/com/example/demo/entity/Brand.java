package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Entity
@Table(name = "brand")
public class Brand {

    /**
     *
     */
    @Id
    private String brandCode;
}
