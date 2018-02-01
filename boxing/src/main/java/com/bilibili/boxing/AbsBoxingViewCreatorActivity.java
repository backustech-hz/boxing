package com.bilibili.boxing;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

public class AbsBoxingViewCreatorActivity extends AppCompatActivity {

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View v = super.onCreateView(parent, name, context, attrs);
        if (v == null) {
            if (BoxingImageView.NAME.equals(name)) {
                v = BoxingMediaLoader.getInstance().createImageView(parent, context, attrs);
            } else if (BoxingPhotoView.NAME.equals(name)) {
                v = BoxingMediaLoader.getInstance().createPhotoView(parent, context, attrs);
            }
        }
        return v;
    }
}
