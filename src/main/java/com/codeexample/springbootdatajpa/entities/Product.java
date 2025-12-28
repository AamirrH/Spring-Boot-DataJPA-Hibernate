package com.codeexample.springbootdatajpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@Entity
@Table(name = "product_table",
        uniqueConstraints = {
        @UniqueConstraint(name = "sku_unique", columnNames = {"sku"}),
          @UniqueConstraint(name = "title_price_unique", columnNames ={"product_title","price"} )
        },
        indexes = {
        @Index(name="sku_index", columnList = "sku")
        }

)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50 /* Length of the SKU */)
    private String sku;

    @Column(name = "product_title")
    private String title;

    private BigDecimal price;

    private Integer quantity;

    @CreationTimestamp // takes cares of the createdAt LocalDateTime i.e when it was created
    private LocalDateTime createdAt;

    @UpdateTimestamp // takes cares of the updatedAt LocalDateTime i.e when it was updated
    private LocalDateTime updatedAt;



}
