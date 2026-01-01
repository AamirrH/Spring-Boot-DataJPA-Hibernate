package com.codeexample.springbootdatajpa.repositories;

import com.codeexample.springbootdatajpa.entities.ProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByCreatedAtAfter(LocalDateTime after);

    List<ProductEntity> findByQuantityGreaterThanAndPriceGreaterThan(int quantity, BigDecimal price);

    /* Since the return type is singular Product Entity, this method should ensure only
    a single entity is returned which can be achieved with the help of unique constraints.
     */
    Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);

    /* Creating Custom Complex Queries
    we have to create a custom JPQL query wherein everything belongs to the java class and then we
    have to pass it inside @Query message where it will be passed to further hibernate and then it is converted to SQL
    and then it is executed inside Database.
     */
    @Query("select e from ProductEntity e where e.price=?1")
    Optional<ProductEntity> getByPrice(BigDecimal price);

    List<ProductEntity> findByOrderById();

    List<ProductEntity> findAll(Sort sort);
    /* Using the Sort class we can sort and display the products on a variety of methods*/



}
