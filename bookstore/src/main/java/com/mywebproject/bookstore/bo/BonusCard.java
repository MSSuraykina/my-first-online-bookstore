package com.mywebproject.bookstore.bo;


import lombok.Data;
import java.sql.Time;

/**
 * Used work with a bonus card
 */
@Data
public class BonusCard {
    private User user;
    private int id;
    private int balance; //балланс
    private String description; //описание
    private Time bonusesBurnTime; //время сгораия бонусов

}
