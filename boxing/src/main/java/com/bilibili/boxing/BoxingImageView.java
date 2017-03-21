package com.bilibili.boxing;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by yhf on 2017/3/21.
 */

public class BoxingImageView extends ImageView {
    static final String NAME = BoxingImageView.class.getName();

    public BoxingImageView(Context context) {
        super(context);
        throw new Error("Activity must extends AbsBoxingViewCreatorActivity");
    }
}
