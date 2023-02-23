package com.example.demo.controller;

import com.example.demo.dto.SearchHoldData;
import com.example.demo.dto.SearchHoldResponse;
import com.example.demo.service.SearchHoldBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 保有銘柄一覧取得_Controller
 */
@RestController
@RequiredArgsConstructor
public class SearchHoldBrandController {

    private final SearchHoldBrandService service;

    @GetMapping("/search-hold-brand")
    public SearchHoldResponse searchHoldBrand() {
        return service.search();
    }

}
