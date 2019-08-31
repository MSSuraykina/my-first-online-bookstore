package com.mywebproject.bookstore.bo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Used to store product data
 */
@Data

public class Product {
    private BigDecimal price;
    private Map<String,String> specifications = new HashMap<>();//характеристики
    private String name;
    private String vendorCode; //артикул
    private String manufacturer; //производитель
    private String description; //описание

}
