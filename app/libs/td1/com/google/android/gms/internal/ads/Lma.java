package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class Lma {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f2533a;

    /* renamed from: b  reason: collision with root package name */
    private int f2534b;

    /* renamed from: c  reason: collision with root package name */
    private int f2535c;
    private final /* synthetic */ Hma d;

    private Lma(Hma hma, byte[] bArr) {
        this.d = hma;
        this.f2533a = bArr;
    }

    public final Lma a(int i) {
        this.f2534b = i;
        return this;
    }

    public final synchronized void a() {
        try {
            if (this.d.f2174b) {
                this.d.f2173a.a(this.f2533a);
                this.d.f2173a.a(this.f2534b);
                this.d.f2173a.e(this.f2535c);
                this.d.f2173a.a((int[]) null);
                this.d.f2173a.Ta();
            }
        } catch (RemoteException e) {
            C0745Vl.a("Clearcut log failed", e);
        }
    }

    public final Lma b(int i) {
        this.f2535c = i;
        return this;
    }
}
