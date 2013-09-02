package com.assetmanagementsystem;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Bijesh C J on 14/8/13.
 */
public class LoginActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }
    public void executeLogin(View view){
        Log.d(TAG, "Login button clicked....");
    }
}
