package com.online.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String userid;
    private String personalnumber;

   }
