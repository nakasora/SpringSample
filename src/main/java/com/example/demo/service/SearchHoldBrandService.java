package com.example.demo.service;
import com.example.demo.dto.SearchHoldData;
import com.example.demo.dto.SearchHoldResponse;
import com.example.demo.entity.BrandMaster;
import com.example.demo.entity.HoldBrand;
import com.example.demo.factory.DtoFactory;
import com.example.demo.repository.HoldBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 保有銘柄一覧取得_Service
 */
@Service
@RequiredArgsConstructor
public class SearchHoldBrandService {

    private final HoldBrandRepository holdBrandRepository;
    private final DtoFactory dtoFactory;

    /**
     * 検索処理
     * @return 検索レスポンス
     */
    public SearchHoldResponse search() {
        return dtoFactory.createSearchHoldResponse(holdBrandRepository.findAll());
    }
}
