package com.bilibili.boxing_impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.bilibili.boxing.loader.IBoxingViewCreator;

import uk.co.senab.photoview.PhotoView;

public class DefaultBoxingViewCreator implements IBoxingViewCreator {
    @Override
    public View createImageView(View parent, Context context, AttributeSet attrs) {
        return new ImageView(context, attrs);
    }

    @Override
    public View createPhotoView(View parent, Context context, AttributeSet attrs) {
        return new PhotoView(context, attrs);
    }
}
