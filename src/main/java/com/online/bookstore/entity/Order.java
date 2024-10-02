package com.online.bookstore.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    private String userid;
    private String title;
    private String author;
    private BigDecimal price;
    private int quantity;

  }
