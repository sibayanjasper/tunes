package com.freedom.tunes.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by jaspersibayan on 06/08/2016.
 */
public class FontManager {

    public static final String FONTAWESOME = "fonts/fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }

}
