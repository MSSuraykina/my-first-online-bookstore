package com.mywebproject.bookstore.bo;

import java.util.LinkedList;
import java.util.List;

//покупатель
public class Customer {
    private boolean singOfPayment = false; //признак оплаты
    private String adres;
    private List<Product> shoppingBasket = new LinkedList<>(); // корзина
    private DeliveryType deliveryType;
}
