package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qK  reason: case insensitive filesystem */
public final class BinderC2003qK extends Coa {

    /* renamed from: a  reason: collision with root package name */
    private final HK f5306a;

    public BinderC2003qK(Context context, AbstractC0229Bp bp, IR ir, C1098dA dAVar, AbstractC2599yoa yoa) {
        JK jk = new JK(dAVar);
        jk.a(yoa);
        this.f5306a = new HK(new PK(bp, context, jk, ir), ir.b());
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final synchronized String Z() {
        return this.f5306a.c();
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final synchronized void a(Zna zna, int i) {
        this.f5306a.a(zna, i);
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final void b(Zna zna) {
        this.f5306a.a(zna, 1);
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final synchronized String k() {
        return this.f5306a.a();
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final synchronized boolean q() {
        return this.f5306a.b();
    }
}
