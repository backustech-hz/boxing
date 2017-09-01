package cn.yinhf.boxingfresco;

import com.bilibili.boxing.BoxingCrop;
import com.bilibili.boxing.BoxingMediaLoader;
import com.bilibili.boxing.loader.IBoxingMediaLoader;
import com.bilibili.boxing.loader.IBoxingViewCreator;

/**
 * BoxingFresco
 */
public class BoxingFresco {

    private static volatile boolean sIsInitialized = false;

    public static void init() {
        if (sIsInitialized) {
            return;
        }
        sIsInitialized = true;

        IBoxingMediaLoader loader = new BoxingFrescoLoader();
        IBoxingViewCreator viewCreator = new BoxingFrascoViewCreator();
        BoxingMediaLoader.getInstance().init(loader, viewCreator);
        BoxingCrop.getInstance().init(new BoxingUcrop());
    }

    public static void forceInitialized() {
        sIsInitialized = true;
    }
}
