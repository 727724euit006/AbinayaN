package com.examly.springapp.service;
import com.examly.springapp.model.PurchaseOrderItem;
import com.examly.springapp.repository.PurchaseOrderItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchaseOrderItemServiceImpl implements PurchaseOrderItemService {
    @Autowired private PurchaseOrderItemRepo repo;

    public PurchaseOrderItem addPurchaseOrderItem(PurchaseOrderItem p) { return repo.save(p); }
    public List<PurchaseOrderItem> getItemsByOrderId(Long orderId) { 
        return repo.findByPurchaseOrderPurchaseOrderId(orderId); 
    }
}