package com.fnb.rofa.co.za.controller.repository;

import com.fnb.rofa.co.za.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {
    Optional<Inventory> findByName(String incidentNumber);
}
