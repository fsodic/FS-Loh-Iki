package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class YK extends WI<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public String f3550b;

    /* renamed from: c  reason: collision with root package name */
    public long f3551c;
    public String d;
    public String e;
    public String f;

    public YK() {
        this.f3550b = "E";
        this.f3551c = -1;
        this.d = "E";
        this.e = "E";
        this.f = "E";
    }

    public YK(String str) {
        this();
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.WI
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f3550b);
        hashMap.put(4, this.f);
        hashMap.put(3, this.e);
        hashMap.put(2, this.d);
        hashMap.put(1, Long.valueOf(this.f3551c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = WI.a(str);
        if (a2 != null) {
            String str2 = "E";
            this.f3550b = a2.get(0) == null ? str2 : (String) a2.get(0);
            this.f3551c = a2.get(1) == null ? -1 : ((Long) a2.get(1)).longValue();
            this.d = a2.get(2) == null ? str2 : (String) a2.get(2);
            this.e = a2.get(3) == null ? str2 : (String) a2.get(3);
            if (a2.get(4) != null) {
                str2 = (String) a2.get(4);
            }
            this.f = str2;
        }
    }
}
