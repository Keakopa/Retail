package com.spring.store.demo.models;


import java.math.BigDecimal;

import shop.AllArgsConstructor;
import shop.Getter;
import shop.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {

    private ItemType type;

    private BigDecimal price;
}
