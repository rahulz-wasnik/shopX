package org.sx.inventory.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.sx.inventory.service.repository.InventoryRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class VerifyStockService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public void areProductsInStock(List<Long> productIds) {
       List<Long> stockQuantities = inventoryRepository.getStockQuantity(productIds);
       Long countOfItemsOutOfStock = stockQuantities.stream().filter(quantity -> quantity == 0).count();
       if (!CollectionUtils.isEmpty(stockQuantities) && countOfItemsOutOfStock > 0) {
           System.out.println("Some items are out of stock");
       }
       // Process payment
    }

}
