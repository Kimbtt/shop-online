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

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(columnDefinition = "varchar(255)")
    private int id;

    @Column(name ="link",nullable = false)
    private String link;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "size", nullable = false)
    private BigInteger size;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name="upload_at", nullable = false)
    private Timestamp uploadAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uploaded_by", nullable = false)
    private User uploadedBy;
}
