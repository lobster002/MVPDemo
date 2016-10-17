package com.example.sky.mvpdemo;

import android.view.View;
import android.widget.TextView;

import com.example.sky.mvpdemo.base.BaseActivity;

public class MainActivity extends BaseActivity<IMainPresenter, MainPresenter> implements IMainPresenter {

    private TextView tv;//这里  --------------------------------------------------

    @Override
    public int doGetLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public void doInitView(View view) {
        findViewById(R.id.btn).setOnClickListener(this);
        tv = (TextView) findViewById(R.id.tv); //-----------------------还有这里  用butterknife 或者其他 代码会更简练
    }


    @Override
    protected MainPresenter doGetPresenter() {
        return new MainPresenter();
    }


    @Override
    public void onClick(View view) {
       mPresenter.click();//响应指定事件，调用指定方法去处理
    }

    @Override
    public void setText(String text) {
        tv.setText(text);

    }
}
