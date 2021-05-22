package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ofa  reason: case insensitive filesystem */
public final class C1892ofa extends WI<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f5152b;

    /* renamed from: c  reason: collision with root package name */
    public Long f5153c;

    public C1892ofa(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.WI
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f5152b);
        hashMap.put(1, this.f5153c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = WI.a(str);
        if (a2 != null) {
            this.f5152b = (Long) a2.get(0);
            this.f5153c = (Long) a2.get(1);
        }
    }
}
