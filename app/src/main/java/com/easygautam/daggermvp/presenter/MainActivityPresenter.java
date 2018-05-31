package com.easygautam.daggermvp.presenter;

import android.util.Log;

import com.easygautam.daggermvp.model.UserModel;
import com.easygautam.daggermvp.pojos.User;
import com.easygautam.daggermvp.view.MainActivity;

import javax.inject.Inject;

/**
 * User Name: gautams2
 * Create Date : 5/31/2018
 */
public class MainActivityPresenter {

    private final String TAG = getClass().getSimpleName();

    MainActivity mainActivity;
    UserModel userModel;

    @Inject
    public MainActivityPresenter(MainActivity mainActivity, UserModel  userModel) {
        this.mainActivity = mainActivity;
        this.userModel = userModel;
        Log.d(TAG, "MainActivityPresenter: init user model is null " + (userModel == null));
    }

    public void showUserMessage(){
        mainActivity.showMessage(userModel.getUserDetails().getEmail());
    }


}
