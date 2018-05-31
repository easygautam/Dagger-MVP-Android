package com.easygautam.daggermvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.easygautam.daggermvp.R;
import com.easygautam.daggermvp.presenter.MainActivityPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    private final String TAG = getClass().getSimpleName();

    @Inject
    MainActivityPresenter presenter;

    @BindView(R.id.tv_message)
    TextView tv_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (presenter == null){
            Log.d(TAG, "onCreate: presenter null");
        } else {
            Log.d(TAG, "onCreate: presenter not null " );
        }

        presenter.showUserMessage();
    }

    @Override
    public void showMessage(String message) {
        tv_message.setText(message);
    }
}
