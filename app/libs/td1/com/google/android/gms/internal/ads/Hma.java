package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b.c.b.a.c.b;

public final class Hma {

    /* renamed from: a  reason: collision with root package name */
    AbstractC1894oga f2173a;

    /* renamed from: b  reason: collision with root package name */
    boolean f2174b;

    public Hma() {
    }

    public Hma(Context context) {
        C2474x.a(context);
        if (((Boolean) C2392voa.e().a(C2474x.Wc)).booleanValue()) {
            try {
                this.f2173a = (AbstractC1894oga) C0693Tl.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", Jma.f2354a);
                b.a(context);
                this.f2173a.b(b.a(context), "GMA_SDK");
                this.f2174b = true;
            } catch (RemoteException | C0771Wl | NullPointerException unused) {
                C0745Vl.a("Cannot dynamite load clearcut");
            }
        }
    }

    public Hma(Context context, String str, String str2) {
        C2474x.a(context);
        try {
            this.f2173a = (AbstractC1894oga) C0693Tl.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", Kma.f2434a);
            b.a(context);
            this.f2173a.a(b.a(context), str, null);
            this.f2174b = true;
        } catch (RemoteException | C0771Wl | NullPointerException unused) {
            C0745Vl.a("Cannot dynamite load clearcut");
        }
    }

    public final Lma a(byte[] bArr) {
        return new Lma(this, bArr);
    }
}
