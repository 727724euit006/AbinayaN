package com.examly.springapp.service;
import com.examly.springapp.model.Product;
import com.examly.springapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired private ProductRepo repo;

    public Product addProduct(Product p) { return repo.save(p); }
    public List<Product> getAllProducts() { return repo.findAll(); }
    public Product getProductById(Long id) { return repo.findById(id).orElse(null); }
    
    public Product updateProduct(Long id, Product p) {
        if(repo.existsById(id)) { 
            p.setProductId(id); 
            return repo.save(p); 
        }
        return null;
    }
    public void deleteProduct(Long id) { repo.deleteById(id); }
}