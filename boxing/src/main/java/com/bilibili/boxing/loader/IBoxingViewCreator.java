package com.bilibili.boxing.loader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yhf on 2017/3/21.
 */

public interface IBoxingViewCreator {

    View createBoxingImageView(View parent, Context context, AttributeSet attrs);

    View createBoxingPhotoView(View parent, Context context, AttributeSet attrs);
}
