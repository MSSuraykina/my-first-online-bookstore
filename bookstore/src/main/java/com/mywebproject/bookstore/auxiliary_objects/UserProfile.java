package com.mywebproject.bookstore.auxiliary_objects;

import lombok.Data;

import java.util.TimeZone;

/**
 * Used to store user settings
 */

@Data

public class UserProfile {
    private Language language;
    private TimeZone timezone;
}
