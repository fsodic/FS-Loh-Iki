package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zN  reason: case insensitive filesystem */
public final class C2626zN implements AbstractC1180eO<C2419wN> {

    /* renamed from: a  reason: collision with root package name */
    private String f6174a;

    public C2626zN(String str) {
        this.f6174a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C2419wN> a() {
        return JW.a(new C2419wN(this.f6174a));
    }
}
