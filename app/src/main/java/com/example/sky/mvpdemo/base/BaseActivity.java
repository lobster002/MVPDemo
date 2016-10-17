package com.example.sky.mvpdemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sky on 2016/10/17.
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends Activity implements View.OnClickListener{

    protected T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        doBefore(savedInstanceState);
        super.onCreate(savedInstanceState);
        View containerView = getLayoutInflater().inflate(doGetLayoutId(), doViewGroupRoot());
        setContentView(containerView);
        doInitPresenter();
        doInitView(containerView);
        doInitData();
        doAfter();
    }

    private void doInitPresenter(){
        mPresenter = doGetPresenter();
        if(mPresenter != null){
            mPresenter.attachViewRef((V)this);
        }
    }

    protected abstract T doGetPresenter();



    public void doBefore(Bundle savedInstanceState) {

    }

    public abstract int doGetLayoutId();

    public ViewGroup doViewGroupRoot() {
        return null;
    }

    public void doInitView(View view) {

    }

    public void doInitData() {

    }

    public void doAfter() {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mPresenter != null)
            mPresenter.detachViewRef();
    }

    @Override
    public void onClick(View view) {

    }
}
