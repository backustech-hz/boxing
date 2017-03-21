package com.bilibili.boxing_impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.bilibili.boxing.loader.IBoxingViewCreator;

import uk.co.senab.photoview.PhotoView;

/**
 * Created by yhf on 2017/3/21.
 */

public class DefaultBoxingViewCreator implements IBoxingViewCreator {
    @Override
    public View createBoxingImageView(View parent, Context context, AttributeSet attrs) {
        return new ImageView(context, attrs);
    }

    @Override
    public View createBoxingPhotoView(View parent, Context context, AttributeSet attrs) {
        return new PhotoView(context, attrs);
    }
}
