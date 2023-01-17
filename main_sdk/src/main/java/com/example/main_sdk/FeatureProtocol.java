package com.example.main_sdk;

import java.util.function.Function;

public interface FeatureProtocol {
    void inputBitmap(String bitmap);
    void setListener(Function<Boolean, Void> listener);
    void clear();
}
