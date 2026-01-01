package com.codeexample.springbootdatajpa.controllers;


import com.codeexample.springbootdatajpa.entities.ProductEntity;
import com.codeexample.springbootdatajpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductTestController {



    private final ProductRepository productRepository;

    public ProductTestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/products")
    public List<ProductEntity> getAllProductsSorted(@RequestParam(defaultValue = "id") String sortBy){
        return productRepository.findAll(Sort.by(Sort.Direction.DESC,sortBy,"price","quantity"));
    }
    /* What this basically does is, we ask the for a parameter in the url which is a RequestParam and the field
    sortBy = ? is provided as a String then that String goes as a parameter to the findProductSorted method, it may
    price, sku, title, etc. and then the Sort class sorts the entire data on the basis of that particular parameter.
    Inside the Sort.by method we can also specify the direction of Sorting and if two products have the same values
    for a sortBy parameter, then they will sorted on the basis of further parameter which are "price", if they have
    same value for price too, then on the basis of quantity.
    NOTE -> the Sort.by returns a sort object.
     */


}
