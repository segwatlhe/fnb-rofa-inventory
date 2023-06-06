package com.fnb.rofa.co.za.controller.service;

import com.fnb.rofa.co.za.adapter.InvoiceAdapter;
import com.fnb.rofa.co.za.controller.repository.InventoryRepository;
import com.fnb.rofa.co.za.dto.InvoiceDTO;
import com.fnb.rofa.co.za.model.Inventory;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InventoryServiceBean implements InventoryService {

    private final InventoryRepository inventoryRepository;
    private final InvoiceAdapter invoiceAdapter;

    public InventoryServiceBean(InventoryRepository inventoryRepository, InvoiceAdapter invoiceAdapter) {
        this.inventoryRepository = inventoryRepository;
        this.invoiceAdapter = invoiceAdapter;
    }

    @Override
    public Optional<Inventory> checkStock(String item) {

        if (item.equals("0")) {

            // create invoice and post it to the invoice service
            InvoiceDTO invoiceDTO = new InvoiceDTO();
            invoiceDTO.setInventoryName("Available");

            return inventoryRepository.findByName("Available");
        } else {
            return null;
        }
    }
}
