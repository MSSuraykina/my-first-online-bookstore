package com.mywebproject.bookstore.bo;

import lombok.Data;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains data and operation logic stocks
 */
@Data

public class Stock {
    private Product product;
    private Time timeActive;
    private String calculation; // расчет
    private List<Product> productsGroup = new ArrayList<>();
    private String description; //описание
}
