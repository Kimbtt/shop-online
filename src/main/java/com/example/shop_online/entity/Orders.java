package com.example.shop_online.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.io.Serializable;
import java.security.Timestamp;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // id đơn hàng

    @Column(name = "created_at")
    private Timestamp createdAt; // Thời gian tạo

    @Column(name = "modified_at")
    private Timestamp modifiedAt; // Thời gian cập nhật

    @Column(name = "note")
    private String note;

    @Column(name = "product_price")
    private int productPrice; // Giá sản phẩm

    @Column(name = "promotion")
    private UsedPromotion promotion; // kHuyến mãi sử dụng

    @Column(name = "receiver_address")
    private String receiverAddress; // ĐỊa chỉ người nhận

    @Column(name = "receiver_name")
    private String receiverName; // Tên người nhận

    @Column(name = "receiver_phone")
    private String receiverPhone; // S�� điện thoại ngư��i nhận

    @Column(name = "size")
    private int size; // Kích thước sản phẩm

    @Column(name = "status")
    private int status; // Trạng thái đơn hàng 1 - chờ lấy hàng 2 - đang giao hàng 3 - đã giao hàng 4 - trả hàng 5 - hủy đơn

    @Column(name = "total_price")
    private int totalPrice; // Tổng tiền đơn hàng

    @ManyToOne
    @JoinColumn(name = "buyer", referencedColumnName = "id")
    private User buyer; // id người mua hang

    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private User createdBy; // id người tạo đơn

    @ManyToOne
    @JoinColumn(name = "modified_by", referencedColumnName = "id")
    private User modifiedBy; // Id người sửa lần cuối

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class UsedPromotion implements Serializable {
    private String couponCode;
    private int discountType;
    private int discountValue;
    private int maximumDiscountValue;
}


