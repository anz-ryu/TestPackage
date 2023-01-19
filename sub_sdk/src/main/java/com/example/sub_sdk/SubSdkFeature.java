package com.example.sub_sdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.sub_sdk_helper.FeatureProtocol;

import java.util.Objects;
import java.util.function.Function;

public class SubSdkFeature implements FeatureProtocol {
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void inputBitmap(String bitmap) {
        listener.apply(Objects.equals(bitmap, "abc"));
    }

    Function<Boolean, Void> listener;
    @Override
    public void setListener(Function<Boolean, Void> listener) {
        this.listener = listener;
    }

    @Override
    public void clear() {
        listener = null;
    }
}
