package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.jfa  reason: case insensitive filesystem */
public final class C1547jfa extends WI<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public Long f4700b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f4701c;
    public Boolean d;

    public C1547jfa(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.WI
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f4700b);
        hashMap.put(1, this.f4701c);
        hashMap.put(2, this.d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = WI.a(str);
        if (a2 != null) {
            this.f4700b = (Long) a2.get(0);
            this.f4701c = (Boolean) a2.get(1);
            this.d = (Boolean) a2.get(2);
        }
    }
}
