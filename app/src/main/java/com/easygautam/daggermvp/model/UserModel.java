package com.easygautam.daggermvp.model;

import com.easygautam.daggermvp.datasource.OnlineDataSource;
import com.easygautam.daggermvp.pojos.User;

import javax.inject.Inject;

/**
 * User Name: gautams2
 * Create Date : 5/30/2018
 */
public class UserModel {

    private OnlineDataSource onlineDataSource;

    @Inject
    public UserModel(OnlineDataSource onlineDataSource) {
        this.onlineDataSource = onlineDataSource;
    }

    public User getUserDetails(){
        return onlineDataSource.getUsers().get(0);
    }
}
