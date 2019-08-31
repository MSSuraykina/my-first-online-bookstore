package com.mywebproject.bookstore.auxiliary_objects;

import lombok.Data;

@Data

/**
 *Used to store user login and password
 */
public class Credential {

    private String login;
    private String password;
}
