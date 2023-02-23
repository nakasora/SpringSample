package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 保有銘柄Entity
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
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

    public static HoldBrand of(String brandCode) {
        return new HoldBrand(brandCode,new BigDecimal(0),new BigDecimal(0),new BigDecimal(0));
    }

    public BigDecimal addQuantity(BigDecimal quantity) {
        return this.quantity.add(quantity);
    }

    public boolean isPositiveQuantity() {
        if (this.quantity.compareTo(BigDecimal.ZERO) < 0) return false;
        return true;
    }


}
