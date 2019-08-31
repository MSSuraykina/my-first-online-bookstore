package com.mywebproject.bookstore.bo;

import lombok.Data;

/**
 * Used to store user purchase data
 */
@Data

public class Customer {
    private boolean singOfPayment = false; //признак оплаты
    private String address;
    private ShoppingBasket shoppingBasket; // корзина
    private DeliveryType deliveryType;
}
