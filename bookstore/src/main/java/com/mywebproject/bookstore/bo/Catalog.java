package com.mywebproject.bookstore.bo;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 *  Used to store a list of goods
 */

@Data

public class Catalog {

    private List<Product> products = new LinkedList<>();
    private List<Stock> stocks = new LinkedList<>();

}
