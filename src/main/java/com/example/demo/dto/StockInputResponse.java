package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 在庫更新レスポンス
 */
@Data
@AllArgsConstructor
public class StockInputResponse {

    /**
     * ステータスコード
     */
    private String statusCode;

    /**
     * メッセージ
     */
    private String message;
}
