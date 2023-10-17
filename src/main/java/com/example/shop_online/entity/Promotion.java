package com.example.shop_online.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "promotion")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id khuyến mãi

    @Column(name = "coupon_code", unique = true, nullable = false)
    private String couponCode; // mã khuyến mãi

    @Column(name = "created_at")
    private Timestamp createdAt; // Thời gian tạo

    @Column(name = "discount_type")
    private int discountType; // Loại chiết khấu:1. theo % 2. theo mức cố định

    @Column(name = "discount_value")
    private BigInteger discountValue; // Giá trị triết khấu

    @Column(name = "expired_at")
    private Timestamp expiredAt; // Thời gian hết hạn

    @Column(name = "is_active")
    private boolean isActive; // Trạng thái kích hoạt

    @Column(name = "is_public")
    private boolean isPublic; // Trạng thái công khai

    @Column(name = "maximum_discount_value")
    private BigInteger maximumDiscountValue; // Giá trị chiết khấu tối đa

    @Column(name = "name", nullable = false, length = 300)
    private String name; // Tên khuyến mãi
}
