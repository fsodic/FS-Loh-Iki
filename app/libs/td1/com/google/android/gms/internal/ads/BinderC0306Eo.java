package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Eo  reason: case insensitive filesystem */
public final class BinderC0306Eo extends AbstractBinderC2463wpa {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0798Xm f1906a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1907b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1908c;
    private final boolean d;
    private int e;
    private AbstractC2601ypa f;
    private boolean g;
    private boolean h = true;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;
    private AbstractC0423Jb n;

    public BinderC0306Eo(AbstractC0798Xm xm, float f2, boolean z, boolean z2) {
        this.f1906a = xm;
        this.i = f2;
        this.f1908c = z;
        this.d = z2;
    }

    private final void a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        C0875_l.e.execute(new RunnableC0384Ho(this, hashMap));
    }

    private final void b(int i2, int i3, boolean z, boolean z2) {
        C0875_l.e.execute(new RunnableC0358Go(this, i2, i3, z, z2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final int P() {
        int i2;
        synchronized (this.f1907b) {
            i2 = this.e;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float W() {
        float f2;
        synchronized (this.f1907b) {
            f2 = this.k;
        }
        return f2;
    }

    public final void Wb() {
        boolean z;
        int i2;
        synchronized (this.f1907b) {
            z = this.h;
            i2 = this.e;
            this.e = 3;
        }
        b(i2, 3, z, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1907b
            monitor-enter(r0)
            float r1 = r3.i     // Catch:{ all -> 0x0051 }
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0012
            float r1 = r3.k     // Catch:{ all -> 0x0051 }
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r3.i = r5     // Catch:{ all -> 0x0051 }
            r3.j = r4     // Catch:{ all -> 0x0051 }
            boolean r4 = r3.h     // Catch:{ all -> 0x0051 }
            r3.h = r7     // Catch:{ all -> 0x0051 }
            int r5 = r3.e     // Catch:{ all -> 0x0051 }
            r3.e = r6     // Catch:{ all -> 0x0051 }
            float r2 = r3.k     // Catch:{ all -> 0x0051 }
            r3.k = r8     // Catch:{ all -> 0x0051 }
            float r8 = r3.k     // Catch:{ all -> 0x0051 }
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0051 }
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x003a
            com.google.android.gms.internal.ads.Xm r8 = r3.f1906a     // Catch:{ all -> 0x0051 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x0051 }
            r8.invalidate()     // Catch:{ all -> 0x0051 }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.Jb r8 = r3.n     // Catch:{ RemoteException -> 0x0047 }
            if (r8 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.Jb r8 = r3.n     // Catch:{ RemoteException -> 0x0047 }
            r8.ua()     // Catch:{ RemoteException -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.C0745Vl.d(r0, r8)
        L_0x004d:
            r3.b(r5, r6, r4, r7)
            return
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC0306Eo.a(float, float, int, boolean, float):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3, boolean z, boolean z2) {
        synchronized (this.f1907b) {
            boolean z3 = false;
            boolean z4 = i2 != i3;
            boolean z5 = !this.g && i3 == 1;
            boolean z6 = z4 && i3 == 1;
            boolean z7 = z4 && i3 == 2;
            boolean z8 = z4 && i3 == 3;
            boolean z9 = z != z2;
            if (this.g || z5) {
                z3 = true;
            }
            this.g = z3;
            if (z5) {
                try {
                    if (this.f != null) {
                        this.f.hb();
                    }
                } catch (RemoteException e2) {
                    C0745Vl.d("#007 Could not call remote method.", e2);
                }
            }
            if (z6 && this.f != null) {
                this.f.ea();
            }
            if (z7 && this.f != null) {
                this.f.X();
            }
            if (z8) {
                if (this.f != null) {
                    this.f.Y();
                }
                this.f1906a.J();
            }
            if (z9 && this.f != null) {
                this.f.c(z2);
            }
        }
    }

    public final void a(AbstractC0423Jb jb) {
        synchronized (this.f1907b) {
            this.n = jb;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void a(AbstractC2601ypa ypa) {
        synchronized (this.f1907b) {
            this.f = ypa;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map) {
        this.f1906a.a("pubVideoCmd", map);
    }

    public final void b(float f2) {
        synchronized (this.f1907b) {
            this.j = f2;
        }
    }

    public final void b(C1028c cVar) {
        boolean z = cVar.f3959a;
        boolean z2 = cVar.f3960b;
        boolean z3 = cVar.f3961c;
        synchronized (this.f1907b) {
            this.l = z2;
            this.m = z3;
        }
        a("initialState", e.a("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float ba() {
        float f2;
        synchronized (this.f1907b) {
            f2 = this.j;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void f(boolean z) {
        a(z ? "mute" : "unmute", null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final float getDuration() {
        float f2;
        synchronized (this.f1907b) {
            f2 = this.i;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final boolean isMuted() {
        boolean z;
        synchronized (this.f1907b) {
            z = this.h;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final boolean la() {
        boolean z;
        boolean qb = qb();
        synchronized (this.f1907b) {
            if (!qb) {
                try {
                    if (this.m && this.d) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void pause() {
        a("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void pb() {
        a("play", null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final boolean qb() {
        boolean z;
        synchronized (this.f1907b) {
            z = this.f1908c && this.l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final void stop() {
        a("stop", null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2532xpa
    public final AbstractC2601ypa vb() {
        AbstractC2601ypa ypa;
        synchronized (this.f1907b) {
            ypa = this.f;
        }
        return ypa;
    }
}
