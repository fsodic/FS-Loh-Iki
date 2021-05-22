package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mka  reason: case insensitive filesystem */
public final class C1764mka {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f4985a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f4986b;

    public final synchronized Map<String, String> a() {
        if (this.f4986b == null) {
            this.f4986b = Collections.unmodifiableMap(new HashMap(this.f4985a));
        }
        return this.f4986b;
    }
}
