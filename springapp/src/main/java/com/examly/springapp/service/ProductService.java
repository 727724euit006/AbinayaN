package com.examly.springapp.service;
import com.examly.springapp.model.Product;
import java.util.List;

public interface ProductService {
    Product addProduct(Product p);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Long id, Product p);
    void deleteProduct(Long id);
}