package com.idogfooding.easyarcrs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.easyar.samples.helloarvideo.MainActivity;

/**
 * 首页
 *
 * @author Charles
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void startAR(View view) {
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
    }

    public void startCRSManager(View view) {
        Intent intent = new Intent();
        intent.setClass(this, CRSManagerActivity.class);
        startActivity(intent);
    }

}
