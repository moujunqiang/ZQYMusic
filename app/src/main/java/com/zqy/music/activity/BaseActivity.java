package com.zqy.music.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zqy.music.R;
import com.zqy.music.util.MyMusicUtil;

/**
 * 基础类用来写一些公共的东西
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.ZhiHuBlueTheme);
    }

}
