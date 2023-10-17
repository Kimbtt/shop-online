package com.example.shop_online.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

/*
 * Lưu thông tin sản phẩm
 * */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name", nullable = false, length = 300)
    private String name;

    @Column(name = "slug", nullable = false)
    private String slug;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brandId; // id thương hiệu

    @Column(name = "description", columnDefinition = "TEXT")
    private String description; // Mô tả

    @Column(name = "is_available")
    private boolean isAvailable; // Trạng thái mở bán

    @Column(name = "created_at")
    private Timestamp createdAt; // Thời gian tạo sản phẩm

    @Column(name = "price")
    private BigInteger price; // Giá bán

    @Column(name = "onfeet_images", columnDefinition = "JSON")
    @Type(type = "json")
    private List<String> onfeetImages; // Mảng link ảnh feedback

    @Column(name = "product_images", columnDefinition = "JSON")
    @Type(type = "json")
    private List<String> productImages; // Mảng link ảnh sản phẩm

    @Column(name = "total_sold")
    private int totalSold; // Số lượng đã bán

    @ManyToMany
    @JoinTable(
            name="product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;
}
