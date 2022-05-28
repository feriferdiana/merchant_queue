package com.project.merchant.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "merchant_type")
public class MerchantType {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private String id;

    @Column(name="type")
    private String type;

    @Column(name="created_date")
    private LocalDateTime createdDate;
}
