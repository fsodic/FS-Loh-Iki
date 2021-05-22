package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.vl  reason: case insensitive filesystem */
public final class C2385vl {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Bitmap> f5833a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f5834b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return this.f5833a.get(num);
    }
}
