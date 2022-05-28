package com.project.merchant.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="merchant_menu")
public class MerchantMenu {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private String id;

    @Column(name="id_merchant")
    private String idMerchant;

    @Column(name="menu")
    private String menu;

    @Column(name="created_date")
    private LocalDateTime createdDate;
}
