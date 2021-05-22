package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.s;

/* renamed from: com.google.android.gms.internal.ads.vC  reason: case insensitive filesystem */
public final class C2339vC extends s.a {

    /* renamed from: a  reason: collision with root package name */
    private final C0707Tz f5782a;

    public C2339vC(C0707Tz tz) {
        this.f5782a = tz;
    }

    private static AbstractC2601ypa a(C0707Tz tz) {
        AbstractC2532xpa n = tz.n();
        if (n == null) {
            return null;
        }
        try {
            return n.vb();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.s.a
    public final void a() {
        AbstractC2601ypa a2 = a(this.f5782a);
        if (a2 != null) {
            try {
                a2.Y();
            } catch (RemoteException e) {
                C0745Vl.c("Unable to call onVideoEnd()", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.s.a
    public final void b() {
        AbstractC2601ypa a2 = a(this.f5782a);
        if (a2 != null) {
            try {
                a2.X();
            } catch (RemoteException e) {
                C0745Vl.c("Unable to call onVideoEnd()", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.s.a
    public final void d() {
        AbstractC2601ypa a2 = a(this.f5782a);
        if (a2 != null) {
            try {
                a2.hb();
            } catch (RemoteException e) {
                C0745Vl.c("Unable to call onVideoEnd()", e);
            }
        }
    }
}
