package com.example.demo.service;
import com.example.demo.dto.SearchHoldResponse;
import com.example.demo.dto.StockInputRequest;
import com.example.demo.dto.StockInputResponse;
import com.example.demo.entity.BrandMaster;
import com.example.demo.entity.HoldBrand;
import com.example.demo.factory.DtoFactory;
import com.example.demo.repository.BrandMasterRepository;
import com.example.demo.repository.HoldBrandRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 在庫入力_Service
 */
@Service
@RequiredArgsConstructor
public class StockInputService {

    private final HoldBrandRepository holdBrandRepository;
    private final BrandMasterRepository brandMasterRepository;

    /**
     * 更新実行
     * @return レスポンス情報
     */
    @Transactional
    public StockInputResponse exec(StockInputRequest request) {
        Optional<BrandMaster> maybeEntity = brandMasterRepository.findById(request.getBrandCode());
        if (!maybeEntity.isEmpty()) return new StockInputResponse("400", "銘柄が存在しません");

        HoldBrand updateDate = holdBrandRepository.findById(request.getBrandCode())
                .orElse(HoldBrand.of(request.getBrandCode()));

        updateDate.addQuantity(request.getQuantity());
        if (!updateDate.isPositiveQuantity()) return new StockInputResponse("400",
                "保有数量が0になる入力はできません");

//        updateDate.updataBookValueCalclatedBy(request.getBookBalue(), request.get)
        return new StockInputResponse("200", "更新成功");
    }
}
