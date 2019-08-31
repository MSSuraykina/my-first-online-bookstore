package com.mywebproject.bookstore.bo;

import lombok.Data;

/**
 * Used to work with customer
 * reviews
 */
@Data
public class Feedback {
    private User user = new User();
    private int rating; //рейтинг
    private String description; //описание
    private Product product = new Product();
}
