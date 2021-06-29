package com.spring.store.demo.models;

import java.time.LocalDate;

import shop.AllArgsConstructor;
import shop.Getter;
import shop.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

	private UserType type;

	private LocalDate registerDate;
}
