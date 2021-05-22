package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class EX<P> {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f1869a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentMap<String, List<HX<P>>> f1870b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private HX<P> f1871c;
    private final Class<P> d;

    private EX(Class<P> cls) {
        this.d = cls;
    }

    public static <P> EX<P> a(Class<P> cls) {
        return new EX<>(cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.HX<P> a(P r9, com.google.android.gms.internal.ads.C1125daa.b r10) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.EX.a(java.lang.Object, com.google.android.gms.internal.ads.daa$b):com.google.android.gms.internal.ads.HX");
    }

    public final Class<P> a() {
        return this.d;
    }

    public final void a(HX<P> hx) {
        if (hx == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (hx.b() == XZ.ENABLED) {
            List<HX<P>> list = this.f1870b.get(new String(hx.d(), f1869a));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f1871c = hx;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        } else {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
    }

    public final HX<P> b() {
        return this.f1871c;
    }
}
