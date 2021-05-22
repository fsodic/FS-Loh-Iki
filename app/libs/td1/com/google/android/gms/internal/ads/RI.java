package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
public final class RI implements GW<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f2999a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f3000b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1941pR f3001c;
    private final /* synthetic */ C2078rR d;
    private final /* synthetic */ OI e;

    RI(OI oi, String str, long j, C1941pR pRVar, C2078rR rRVar) {
        this.e = oi;
        this.f2999a = str;
        this.f3000b = j;
        this.f3001c = pRVar;
        this.d = rRVar;
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(T t) {
        long b2 = this.e.f2733a.b();
        this.e.a(this.f2999a, 0, b2 - this.f3000b, this.f3001c.Y);
        if (this.e.d) {
            this.e.f2734b.a(this.d, this.f3001c, 0, null, b2 - this.f3000b);
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        long b2 = this.e.f2733a.b();
        int i = 6;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof EI) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof MR) {
            i = 5;
        } else if ((th instanceof C0896aF) && ((C0896aF) th).a().f3128a == 3) {
            i = 1;
        }
        this.e.a(this.f2999a, i, b2 - this.f3000b, this.f3001c.Y);
        if (this.e.d) {
            this.e.f2734b.a(this.d, this.f3001c, i, th instanceof C2068rH ? (C2068rH) th : null, b2 - this.f3000b);
        }
    }
}
