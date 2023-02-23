package com.example.demo.controller;
import com.example.demo.dto.SearchHoldResponse;
import com.example.demo.factory.DtoFactory;
import com.example.demo.repository.HoldBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 在庫入力_Service
 */
@Service
@RequiredArgsConstructor
public class StockInputController {

    private final HoldBrandRepository holdBrandRepository;
    private final DtoFactory dtoFactory;

    /**
     * 在庫入力
     * @return 更新データ
     */
    public SearchHoldResponse search() {
        return dtoFactory.createSearchHoldResponse(holdBrandRepository.findAll());
    }
}
