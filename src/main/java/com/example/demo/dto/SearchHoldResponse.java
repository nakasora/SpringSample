package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 保有銘柄一覧取得レスポンス
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchHoldResponse {

    public List<SearchHoldData> dataList;
}
