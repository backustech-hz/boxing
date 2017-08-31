package com.bilibili.boxing.impl;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.View;

import com.bilibili.boxing.loader.IBoxingCallback;
import com.bilibili.boxing.loader.IBoxingMediaLoader;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

import me.relex.photodraweeview.PhotoDraweeView;

public class BoxingFastFrescoLoader implements IBoxingMediaLoader {
    @Override
    public void setImageResource(@NonNull View img, int drawableResId) {
        if (drawableResId != 0) {
            // TODO drawableResId 为0 时表示设置为空
            ((SimpleDraweeView) img).getHierarchy().setPlaceholderImage(drawableResId);
        }
    }

    @Override
    public void displayThumbnail(@NonNull View img, @NonNull String absPath, int width, int height) {
        SimpleDraweeView simpleDraweeView = ((SimpleDraweeView) img);
        simpleDraweeView.setController(Fresco.newDraweeControllerBuilder()
                .setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + absPath))
                    .setResizeOptions(ResizeOptions.forDimensions(width, height))
                    .build())
                .setOldController(simpleDraweeView.getController())
                .build());
    }

    @Override
    public void displayRaw(@NonNull final View img, @NonNull String absPath, int width, int height, final IBoxingCallback callback) {
        SimpleDraweeView simpleDraweeView = ((SimpleDraweeView) img);
        PipelineDraweeControllerBuilder draweeControllerBuilder = Fresco.newDraweeControllerBuilder()
                .setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + absPath))
                        .setResizeOptions(ResizeOptions.forDimensions(width, height))
                        .build())
                .setOldController(simpleDraweeView.getController());
        if (callback != null) {
            draweeControllerBuilder.setControllerListener(new ControllerListener<ImageInfo>() {
                @Override
                public void onSubmit(String id, Object callerContext) {

                }

                @Override
                public void onFinalImageSet(String id, ImageInfo imageInfo, Animatable animatable) {
                    if (img instanceof PhotoDraweeView) {
                        ((PhotoDraweeView) img).update(imageInfo.getWidth(), imageInfo.getHeight());
                    }
                    callback.onSuccess();
                }

                @Override
                public void onIntermediateImageSet(String id, ImageInfo imageInfo) {

                }

                @Override
                public void onIntermediateImageFailed(String id, Throwable throwable) {

                }

                @Override
                public void onFailure(String id, Throwable throwable) {
                    callback.onFail(throwable);
                }

                @Override
                public void onRelease(String id) {

                }
            });
        }
        simpleDraweeView.setController(draweeControllerBuilder.build());
    }
}
