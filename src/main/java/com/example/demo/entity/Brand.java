package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table(name = "brand")
public class Brand {

    /**
     * 銘柄コード
     */
    @Id
    private int brandCode;

    /**
     * 銘柄名称
     */
    @Column
    private String brandName;

    /**
     * クーポン回数
     */
    @Column
    private int couponNum;

    /**
     * 年利
     */
    @Column
    private BigDecimal rate;

    /**
     * 償還年月日
     */
    @Column
    private String SyokanDate;
}
