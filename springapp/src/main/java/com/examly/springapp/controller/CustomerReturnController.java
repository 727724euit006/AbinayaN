package com.examly.springapp.controller;

import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.service.CustomerReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customer-returns")
public class CustomerReturnController {

    @Autowired
    private CustomerReturnService customerReturnService;

    @PostMapping
    public ResponseEntity<CustomerReturn> addCustomerReturn(@RequestBody CustomerReturn ret) {
        return new ResponseEntity<>(customerReturnService.addCustomerReturn(ret), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CustomerReturn>> getAllCustomerReturns() {
        return new ResponseEntity<>(customerReturnService.getAllCustomerReturns(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerReturn> getCustomerReturnById(@PathVariable Long id) {
        CustomerReturn ret = customerReturnService.getCustomerReturnById(id);
        return ret != null ? ResponseEntity.ok(ret) : ResponseEntity.notFound().build();
    }
}