package org.sx.inventory.service.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.sx.inventory.service.entity.Inventory;

import java.util.List;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {

    @Query("SELECT i.stockQuantity FROM Inventory i WHERE i.id IN (:productIds)")
    List<Long> getStockQuantity(@Param("productIds") List<Long> productIds);
}
