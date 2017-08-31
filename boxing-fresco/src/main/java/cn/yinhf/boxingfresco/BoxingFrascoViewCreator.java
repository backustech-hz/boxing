package cn.yinhf.boxingfresco;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.bilibili.boxing.loader.IBoxingViewCreator;
import com.facebook.drawee.view.SimpleDraweeView;

import me.relex.photodraweeview.PhotoDraweeView;

public class BoxingFrascoViewCreator implements IBoxingViewCreator {
    @Override
    public View createImageView(View parent, Context context, AttributeSet attrs) {
        // TODO cropType
        return new SimpleDraweeView(context, attrs);
    }

    @Override
    public View createPhotoView(View parent, Context context, AttributeSet attrs) {
        return new PhotoDraweeView(context, attrs);
    }
}
