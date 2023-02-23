package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 保有銘柄一覧取得レスポンス
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchHoldData {

    /**
     * 銘柄コード
     */
    private String brandCode;

    /**
     * 銘柄名称
     */
    private String brandName;

    /**
     * 保有数量
     */
    private BigDecimal quantity;

    /**
     * 簿価
     */
    private BigDecimal bookValue;

    /**
     * 時価
     */
    private BigDecimal marketPrice;

    /**
     * 評価損益
     */
    private BigDecimal valuedProfitLoss;
}
