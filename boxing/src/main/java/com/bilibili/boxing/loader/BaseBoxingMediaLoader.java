package com.bilibili.boxing.loader;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by yhf on 2017/3/20.
 */

public abstract class BaseBoxingMediaLoader implements IBoxingMediaLoader {
    @Override
    public void setPlaceHolder(@NonNull View img, int drawableResId) {
        ((ImageView) img).setImageResource(drawableResId);
    }
}
