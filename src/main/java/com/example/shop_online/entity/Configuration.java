package com.example.shop_online.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "configuration")
public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "obo_choices", nullable = false, columnDefinition = "JSON")
    @Type(type = "json")
    private List<?> oboChoices;
}
