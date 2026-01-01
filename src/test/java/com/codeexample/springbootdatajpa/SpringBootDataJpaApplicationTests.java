package com.codeexample.springbootdatajpa;

import com.codeexample.springbootdatajpa.entities.ProductEntity;
import com.codeexample.springbootdatajpa.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringBootDataJpaApplicationTests {

//    @Autowired // Running Tests
//    ProductRepository productRepository;
//
//    @Test
//    void contextLoads() {
//    }
//
//    @Test
//    void getProductById(){
//        ProductEntity productEntity = productRepository.findById(1L).orElse(null);
//        System.out.println(productEntity.getTitle());
//    }
//    @Test
//    void getProductAfterCreationDate(){
//        LocalDateTime now = LocalDateTime.of(2025,12,28,1,1);
//        List<ProductEntity> productEntities = productRepository.findByCreatedAtAfter(now);
//        System.out.println(productEntities);
//
//    }
//    @Test
//    void getrice(){
//        List<ProductEntity> productEntities = productRepository.findByQuantityGreaterThanAndPriceGreaterThan(2, BigDecimal.valueOf(13.5));
//        System.out.println(productEntities);
//    }
//    @Test
//    void get(){
//        Optional<ProductEntity> productEntity1 = productRepository.findByTitleAndPrice("Oreo",BigDecimal.valueOf(13.4));
//        productEntity1.ifPresent(System.out::println);

    }



