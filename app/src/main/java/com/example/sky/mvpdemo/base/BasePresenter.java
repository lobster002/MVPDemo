package com.example.sky.mvpdemo.base;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by Sky on 2016/10/17.
 */

public class BasePresenter<T extends Object> {
    protected Reference<T> mViewRef;

    public void attachViewRef(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    protected T getViewRef() {
        if (null != mViewRef)
            return mViewRef.get();
        return null;
    }

    public boolean isViewRefAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachViewRef() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
