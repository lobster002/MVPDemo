package com.example.sky.mvpdemo;

import com.example.sky.mvpdemo.base.BasePresenter;

/**
 * Created by Sky on 2016/10/17.
 */

public class MainPresenter extends BasePresenter<IMainPresenter> {

   public void click(){//相应用户交互逻辑  其他写其他方法
       /**
        * Do someThing here
        * ***/
        getViewRef().setText("点我干啥！");//逻辑处理完毕   回调回去 刷新界面
    }
}
