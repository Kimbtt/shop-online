package com.example.shop_online.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_size")
@IdClass(ProductSizeId.class)
public class ProductSize {
    @Id
    @Column(name="product_id")
    private String productId; // Id sản phẩm

    @Id
    @Column(name = "size")
    private int size; // Kích thước

    @Column(name = "quantity", nullable = false)
    private int quantity; //Số lượng
}

class ProductSizeId implements Serializable {
    private String productId;
    private int size;
}
