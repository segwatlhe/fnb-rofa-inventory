package com.fnb.rofa.co.za.controller;

import com.fnb.rofa.co.za.controller.service.InventoryService;
import com.fnb.rofa.co.za.model.Inventory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fnb/")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    // check stock availability
    @GetMapping("get-item/{item1}")
    public ResponseEntity<Inventory> checkStock(@PathVariable String item1) {
        return ResponseEntity.of(inventoryService.checkStock(item1));
    }
}
