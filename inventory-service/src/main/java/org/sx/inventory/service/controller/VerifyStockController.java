package org.sx.inventory.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sx.inventory.service.service.VerifyStockService;

import java.util.List;

@RestController
@RequestMapping("api/v1/verify-stock")
public class VerifyStockController {

    @Autowired
    private VerifyStockService verifyStockService;

    @GetMapping("/products")
    public void areProductsInStock(@RequestParam("ids") List<Long> productIds) {
        verifyStockService.areProductsInStock(productIds);
    }
}
