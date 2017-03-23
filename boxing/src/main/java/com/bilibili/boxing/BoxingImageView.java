package com.bilibili.boxing;

import android.content.Context;
import android.widget.ImageView;

public class BoxingImageView extends ImageView {
    static final String NAME = BoxingImageView.class.getName();

    public BoxingImageView(Context context) {
        super(context);
        throw new Error("Activity must extends AbsBoxingViewCreatorActivity");
    }
}
