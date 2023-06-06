package com.fnb.rofa.co.za.controller.service;

import com.fnb.rofa.co.za.model.Inventory;

import java.util.Optional;

public interface InventoryService {
   Optional<Inventory> checkStock(String incidentNumber);
}
