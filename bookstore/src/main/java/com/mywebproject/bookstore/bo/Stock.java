package com.mywebproject.bookstore.bo;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

//акция
public class Stock {
    private Product product;
    private Data timeActive;
    private String calculation; // расчет
    private List<Product> productsGroup = new ArrayList<>();
    private String description; //описание
}
