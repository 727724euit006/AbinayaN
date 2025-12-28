package com.examly.springapp.service;
import com.examly.springapp.model.PurchaseOrderItem;
import java.util.List;

public interface PurchaseOrderItemService {
    PurchaseOrderItem addPurchaseOrderItem(PurchaseOrderItem p);
    List<PurchaseOrderItem> getItemsByOrderId(Long orderId);
}