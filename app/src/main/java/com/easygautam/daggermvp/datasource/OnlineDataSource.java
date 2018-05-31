package com.easygautam.daggermvp.datasource;

import com.easygautam.daggermvp.pojos.User;

import java.util.ArrayList;
import java.util.List;

/**
 * User Name: gautams2
 * Create Date : 5/30/2018
 */
public class OnlineDataSource {

    private List<User> users ;

    public OnlineDataSource() {
        users = new ArrayList<>();
        users.add(new User(1, "Gautam", "gautam90055@gmail.com"));
        users.add(new User(1, "Gautam", "gautam90055@gmail.com"));
        users.add(new User(1, "Gautam", "gautam90055@gmail.com"));
        users.add(new User(1, "Gautam", "gautam90055@gmail.com"));

    }

    public List<User> getUsers() {
        return users;
    }
}
