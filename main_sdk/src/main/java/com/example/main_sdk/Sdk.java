package com.example.main_sdk;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.function.Function;

public class Sdk {
    public static Sdk shared = new Sdk();

    FeatureProtocol featureProtocol;
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void useFeature(FeatureProtocol featureProtocol) {
        this.featureProtocol = featureProtocol;
        featureProtocol.inputBitmap("abc");
    }
}
