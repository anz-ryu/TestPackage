package com.example.sub_sdk_helper;

import java.util.function.Function;

public interface FeatureProtocol {
    void inputBitmap(String bitmap);
    void setListener(Function<Boolean, Void> listener);
    void clear();
}
