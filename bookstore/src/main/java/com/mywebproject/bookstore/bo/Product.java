package com.mywebproject.bookstore.bo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//товар
public class Product {
    private BigDecimal price;
    private Map<String,String> specifications = new HashMap<>();//характеристики
    private String name;
    private String vendorCode; //артикул
    private String manufacturer; //производитель
    private String description; //описание

}
