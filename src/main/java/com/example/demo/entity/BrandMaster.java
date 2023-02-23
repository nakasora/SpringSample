package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.annotation.Id;

/**
 * 銘柄マスタEntity
 */
@Data
@Entity
@Table(name = "brand_master")
public class BrandMaster {

    /**
     * 銘柄コード
     */
    @Id
    @Column(name = "brand_code")
    private String brandCode;

    /**
     * 銘柄名称
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * 保有銘柄
     */
    @ManyToOne
    @JoinColumn(name = "brand_code", referencedColumnName = "brand_code", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private HoldBrand holdBrand;
}
