package com.easygautam.daggermvp.datasource;

import com.easygautam.daggermvp.pojos.User;

import java.util.ArrayList;
import java.util.List;

/**
 * User Name: gautams2
 * Create Date : 5/30/2018
 */
public class OnlineDataSource {

    List<User> users ;

    public OnlineDataSource() {
        users = new ArrayList<>();
        users.add(new User(1, "Gautam", "Gautams2@Chetu.com"));
        users.add(new User(2, "Gautam", "Gautams2@Chetu.com"));
        users.add(new User(3, "Gautam", "Gautams2@Chetu.com"));
        users.add(new User(4, "Gautam", "Gautams2@Chetu.com"));
        users.add(new User(5, "Gautam", "Gautams2@Chetu.com"));
    }

    public List<User> getUsers() {
        return users;
    }
}
