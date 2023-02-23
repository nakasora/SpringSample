package com.example.demo.factory;

import com.example.demo.dto.SearchHoldData;
import com.example.demo.dto.SearchHoldResponse;
import com.example.demo.entity.BrandMaster;
import com.example.demo.entity.HoldBrand;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class DtoFactory {

    public SearchHoldResponse createSearchHoldResponse(List<HoldBrand> dataList) {

        List<SearchHoldData> list = new ArrayList<>();
        for (HoldBrand holdBrand : dataList) {
            BrandMaster brandMaster = holdBrand.getBrandMaster();
            SearchHoldData data = new SearchHoldData(
                    brandMaster.getBrandCode(),
                    brandMaster.getBrandName(),
                    holdBrand.getQuantity(),
                    holdBrand.getBookValue(),
                    holdBrand.hasMarketPrice() ? holdBrand.getMarketPrice() : new BigDecimal(0),
                    holdBrand.hasMarketPrice() ? holdBrand.calcValuedProfitLoss() : new BigDecimal(0)
            );
            list.add(data);
        }
        SearchHoldResponse response = new SearchHoldResponse(list);
        return response;

    }
}
