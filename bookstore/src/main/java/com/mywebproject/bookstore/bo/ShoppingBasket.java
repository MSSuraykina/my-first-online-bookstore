package com.mywebproject.bookstore.bo;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * Contains a list of products selected by the user
 */
@Data

public class ShoppingBasket {

    private List<Product> products = new LinkedList<>();
    private User user = new User();
}
