package com.example.demo.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 在庫入力リクエスト
 */
@Data
@AllArgsConstructor
public class StockInputRequest {

    /**
     * 銘柄コード
     */
    @NotBlank
    @Pattern(regexp = "^[0-9+$]")
    private String brandCode;

    /**
     * 数量
     */
    @NotBlank
    @Pattern(regexp = "^[0-9+$]|^-[0-9]+$")
    @Size(min=1, max=6)
    private BigDecimal quantity;

    /**
     * 簿価
     */
    @NotBlank
    @Pattern(regexp = "^[0-9+$]")
    @Digits(integer=7, fraction=16)
    private BigDecimal bookBalue;

}
