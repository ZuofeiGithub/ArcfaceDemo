package com.arcsoft.arcfacedemo.fragment;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context).load((String)path).into(imageView);
    }

    @Override
    public ImageView createImageView(Context context) {
        return super.createImageView(context);
    }
}
