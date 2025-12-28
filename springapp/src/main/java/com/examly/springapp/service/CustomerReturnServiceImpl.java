package com.examly.springapp.service;

import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.repository.CustomerReturnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerReturnServiceImpl implements CustomerReturnService {

    @Autowired
    private CustomerReturnRepo customerReturnRepo;

    @Override
    public CustomerReturn addCustomerReturn(CustomerReturn ret) {
        return customerReturnRepo.save(ret);
    }

    @Override
    public List<CustomerReturn> getAllCustomerReturns() {
        return customerReturnRepo.findAll();
    }

    @Override
    public CustomerReturn getCustomerReturnById(Long id) {
        return customerReturnRepo.findById(id).orElse(null);
    }
}