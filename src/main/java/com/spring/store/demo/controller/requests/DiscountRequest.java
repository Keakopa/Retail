package com.spring.store.demo.controller.requests;


import com.spring.store.demo.models.Bill;
import com.spring.store.demo.models.User;

import shop.Getter;
import shop.Setter;

@Getter
@Setter
public class DiscountRequest {

    private User user;

    private Bill bill;

}
