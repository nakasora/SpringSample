package com.example.demo.controller;
import com.example.demo.dto.SearchHoldResponse;
import com.example.demo.dto.StockInputRequest;
import com.example.demo.dto.StockInputResponse;
import com.example.demo.factory.DtoFactory;
import com.example.demo.repository.HoldBrandRepository;
import com.example.demo.service.StockInputService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在庫入力_Service
 */
@RestController
@RequiredArgsConstructor
public class StockInputController {

    private final StockInputService service;

    /**
     * 在庫入力
     * @return 更新データ
     */
    public StockInputResponse Input(@RequestBody @Valid StockInputRequest request) {
        return service.exec(request);
    }
}
