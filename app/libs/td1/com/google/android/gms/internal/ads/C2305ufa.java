package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ufa  reason: case insensitive filesystem */
public final class C2305ufa extends WI<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f5740b;

    /* renamed from: c  reason: collision with root package name */
    public Long f5741c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;

    public C2305ufa(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.WI
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f5740b);
        hashMap.put(1, this.f5741c);
        hashMap.put(2, this.d);
        hashMap.put(3, this.e);
        hashMap.put(4, this.f);
        hashMap.put(5, this.g);
        hashMap.put(6, this.h);
        hashMap.put(7, this.i);
        hashMap.put(8, this.j);
        hashMap.put(9, this.k);
        hashMap.put(10, this.l);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = WI.a(str);
        if (a2 != null) {
            this.f5740b = (Long) a2.get(0);
            this.f5741c = (Long) a2.get(1);
            this.d = (Long) a2.get(2);
            this.e = (Long) a2.get(3);
            this.f = (Long) a2.get(4);
            this.g = (Long) a2.get(5);
            this.h = (Long) a2.get(6);
            this.i = (Long) a2.get(7);
            this.j = (Long) a2.get(8);
            this.k = (Long) a2.get(9);
            this.l = (Long) a2.get(10);
        }
    }
}
