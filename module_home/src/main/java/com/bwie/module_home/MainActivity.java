package com.bwie.module_home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bwie.lib_core.ArouterPath;

@Route(path = ArouterPath.HOME_URL)
public class MainActivity extends AppCompatActivity {

    @Autowired
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //注入到arouter管理系统
        ARouter.getInstance().inject(this);
        System.out.println("name==="+name);

    }
}
