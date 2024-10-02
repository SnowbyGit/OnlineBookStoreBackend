package com.online.bookstore.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {

    private String title;
    private String author;
    private BigDecimal price;
    private int quantity;
    private String description;
    private String src;

}
