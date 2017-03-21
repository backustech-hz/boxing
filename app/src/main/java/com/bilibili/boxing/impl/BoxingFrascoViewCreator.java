package com.bilibili.boxing.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.bilibili.boxing.loader.IBoxingViewCreator;
import com.facebook.drawee.view.SimpleDraweeView;

import me.relex.photodraweeview.PhotoDraweeView;

/**
 * Created by yhf on 2017/3/21.
 */

public class BoxingFrascoViewCreator implements IBoxingViewCreator {
    @Override
    public View createBoxingImageView(View parent, Context context, AttributeSet attrs) {
        // TODO cropType
        return new SimpleDraweeView(context, attrs);
    }

    @Override
    public View createBoxingPhotoView(View parent, Context context, AttributeSet attrs) {
        return new PhotoDraweeView(context, attrs);
    }
}
