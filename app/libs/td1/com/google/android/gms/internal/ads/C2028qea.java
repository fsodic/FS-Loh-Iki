package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qea  reason: case insensitive filesystem */
public final class C2028qea extends WI<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public long f5333b;

    /* renamed from: c  reason: collision with root package name */
    public long f5334c;

    public C2028qea() {
        this.f5333b = -1;
        this.f5334c = -1;
    }

    public C2028qea(String str) {
        this();
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.WI
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f5333b));
        hashMap.put(1, Long.valueOf(this.f5334c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = WI.a(str);
        if (a2 != null) {
            this.f5333b = ((Long) a2.get(0)).longValue();
            this.f5334c = ((Long) a2.get(1)).longValue();
        }
    }
}
