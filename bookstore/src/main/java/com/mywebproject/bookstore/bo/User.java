package com.mywebproject.bookstore.bo;

import com.mywebproject.bookstore.auxiliary_objects.Credential;

import lombok.Data;

/**
 * Contains user data
 */
@Data

public class User {

private UserType userType;
private Credential credentials;
private String name;
private UserGroup group;

}
