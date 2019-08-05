package com.bwie.modulearouterdemo;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bwie.lib_core.ArouterPath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.gotohome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(ArouterPath.HOME_URL).withString("name","kson").navigation();

                Fragment homeFrament = (Fragment) ARouter.getInstance().build("/home/homeFragment").navigation();
                System.out.println("frament==="+homeFrament);
            }
        });
    }

   /* *//**
     * 跳转到home组件
     * @param view
     *//*
    public void gotoHome(View view) {
//        startActivity(new Intent(this, com.bwie.module_home.MainActivity.class));


    }*/
}
