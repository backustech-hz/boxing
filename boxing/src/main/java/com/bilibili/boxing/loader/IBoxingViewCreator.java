package com.bilibili.boxing.loader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public interface IBoxingViewCreator {

    View createImageView(View parent, Context context, AttributeSet attrs);

    View createPhotoView(View parent, Context context, AttributeSet attrs);
}
