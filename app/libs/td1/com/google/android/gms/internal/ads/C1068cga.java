package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.cga  reason: case insensitive filesystem */
public final class C1068cga<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AtomicReference<T>> f4013a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f4013a.containsKey(str)) {
                this.f4013a.put(str, new AtomicReference<>());
            }
        }
        return this.f4013a.get(str);
    }
}
