package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 保有銘柄Entity
 */
@Data
@Entity
@Table(name = "hold_brand")
public class HoldBrand {

    /**
     * 銘柄コード
     */
    @Id
    @Column(name = "brand_code")
    private String brandCode;

    /**
     * 保有数量
     */
    @Column(name = "brand_name")
    private BigDecimal quantity;

    /**
     * 簿価
     */
    @Column(name = "book_value")
    private BigDecimal bookValue;

    /**
     * 市場価格
     */
    @Column(name = "market_price")
    private BigDecimal marketPrice;

    /**
     * 銘柄マスタ
     */
    @OneToMany
    @JoinColumn(name = "brand_code", referencedColumnName = "brand_code", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private BrandMaster brandMaster;

    /**
     * 評価損益計算
     * @return 評価損益
     */
    public BigDecimal calcValuedProfitLoss() {
        return (this.marketPrice.subtract(this.bookValue)).multiply(this.quantity).setScale(3, RoundingMode.DOWN);
    }

    /**
     * 市場価格がNullか判定
     */
    public boolean hasMarketPrice() {
        if (this.marketPrice == null) return false;
        return  true;
    }
}
