package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import b.c.b.a.b.b;
import com.google.android.gms.common.internal.AbstractC0176b;
import com.google.android.gms.internal.ads.C0262Cw;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fU  reason: case insensitive filesystem */
public final class C1255fU implements AbstractC0176b.a, AbstractC0176b.AbstractC0028b {

    /* renamed from: a  reason: collision with root package name */
    private CU f4295a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4296b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4297c;
    private final EnumC1274fga d;
    private final int e = 1;
    private final LinkedBlockingQueue<OU> f;
    private final HandlerThread g;
    private final UT h;
    private final long i;

    public C1255fU(Context context, int i2, EnumC1274fga fga, String str, String str2, String str3, UT ut) {
        this.f4296b = str;
        this.d = fga;
        this.f4297c = str2;
        this.h = ut;
        this.g = new HandlerThread("GassDGClient");
        this.g.start();
        this.i = System.currentTimeMillis();
        this.f4295a = new CU(context, this.g.getLooper(), this, this, 19621000);
        this.f = new LinkedBlockingQueue<>();
        this.f4295a.l();
    }

    private final void a() {
        CU cu = this.f4295a;
        if (cu == null) {
            return;
        }
        if (cu.isConnected() || this.f4295a.c()) {
            this.f4295a.a();
        }
    }

    private final void a(int i2, long j, Exception exc) {
        UT ut = this.h;
        if (ut != null) {
            ut.a(i2, System.currentTimeMillis() - j, exc);
        }
    }

    private final FU b() {
        try {
            return this.f4295a.z();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static OU c() {
        return new OU(null, 1);
    }

    public final OU a(int i2) {
        OU ou;
        try {
            ou = this.f.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            a(2009, this.i, e2);
            ou = null;
        }
        a(3004, this.i, null);
        if (ou != null) {
            UT.a(ou.f2749c == 7 ? C0262Cw.c.DISABLED : C0262Cw.c.ENABLED);
        }
        return ou == null ? c() : ou;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnected(Bundle bundle) {
        FU b2 = b();
        if (b2 != null) {
            try {
                OU a2 = b2.a(new MU(this.e, this.d, this.f4296b, this.f4297c));
                a(5011, this.i, null);
                this.f.put(a2);
            } catch (Throwable th) {
                a();
                this.g.quit();
                throw th;
            }
            a();
            this.g.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b
    public final void onConnectionFailed(b bVar) {
        try {
            a(4012, this.i, null);
            this.f.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnectionSuspended(int i2) {
        try {
            a(4011, this.i, null);
            this.f.put(c());
        } catch (InterruptedException unused) {
        }
    }
}
