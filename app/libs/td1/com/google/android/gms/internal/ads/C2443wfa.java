package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.wfa  reason: case insensitive filesystem */
public final class C2443wfa extends WI<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f5905b;

    /* renamed from: c  reason: collision with root package name */
    public Long f5906c;
    public Long d;
    public Long e;

    public C2443wfa(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.WI
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f5905b);
        hashMap.put(1, this.f5906c);
        hashMap.put(2, this.d);
        hashMap.put(3, this.e);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = WI.a(str);
        if (a2 != null) {
            this.f5905b = (Long) a2.get(0);
            this.f5906c = (Long) a2.get(1);
            this.d = (Long) a2.get(2);
            this.e = (Long) a2.get(3);
        }
    }
}
