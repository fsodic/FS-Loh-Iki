package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.cocos2dx.lib.BuildConfig;

public final class HT implements AbstractC1740mX {

    /* renamed from: a  reason: collision with root package name */
    private static HT f2133a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2134b;

    /* renamed from: c  reason: collision with root package name */
    private final KU f2135c;
    private final VU d;
    private final C1754mfa e;
    private final UT f;
    private final Executor g;
    private final EnumC1274fga h;
    private final QU i;
    private volatile long j = 0;
    private final Object k = new Object();
    private volatile boolean l;

    private HT(Context context, UT ut, KU ku, VU vu, C1754mfa mfa, Executor executor, ST st, EnumC1274fga fga) {
        this.f2134b = context;
        this.f = ut;
        this.f2135c = ku;
        this.d = vu;
        this.e = mfa;
        this.g = executor;
        this.h = fga;
        this.i = new C1394hV(this, st);
    }

    static HT a(Context context, UT ut, VT vt) {
        return a(context, ut, vt, Executors.newCachedThreadPool());
    }

    private static HT a(Context context, UT ut, VT vt, Executor executor) {
        C1324gU a2 = C1324gU.a(context, executor, ut, vt);
        C1685lfa lfa = new C1685lfa(context);
        C1754mfa mfa = new C1754mfa(vt, a2, new View$OnAttachStateChangeListenerC2650zfa(context, lfa), lfa);
        EnumC1274fga a3 = new C2495xU(context, ut).a();
        ST st = new ST();
        return new HT(context, ut, new KU(context, a3), new VU(context, mfa, ut, st), mfa, executor, st, a3);
    }

    public static synchronized HT a(String str, Context context, boolean z) {
        HT ht;
        synchronized (HT.class) {
            if (f2133a == null) {
                YT c2 = VT.c();
                c2.a(str);
                c2.a(z);
                VT a2 = c2.a();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                HT a3 = a(context, UT.a(context, newCachedThreadPool), a2, newCachedThreadPool);
                f2133a = a3;
                a3.a();
                f2133a.d();
            }
            ht = f2133a;
        }
        return ht;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae A[Catch:{ Bca -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb A[Catch:{ Bca -> 0x00f6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HT.c():void");
    }

    private final void d() {
        if (!this.l) {
            synchronized (this.k) {
                if (!this.l) {
                    if ((System.currentTimeMillis() / 1000) - this.j >= 3600) {
                        LU b2 = this.d.b();
                        if (b2 == null || b2.a(3600)) {
                            b();
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context) {
        d();
        XT a2 = this.d.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, (String) null);
        this.f.a(5001, System.currentTimeMillis() - currentTimeMillis, a3, null);
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context, View view, Activity activity) {
        d();
        XT a2 = this.d.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, null, view, activity);
        this.f.a(5002, System.currentTimeMillis() - currentTimeMillis, a3, null);
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context, String str, View view) {
        return a(context, str, view, (Activity) null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context, String str, View view, Activity activity) {
        d();
        XT a2 = this.d.a();
        if (a2 == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a2.a(context, null, str, view, activity);
        this.f.a(5000, System.currentTimeMillis() - currentTimeMillis, a3, null);
        return a3;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        long currentTimeMillis = System.currentTimeMillis();
        LU a2 = this.f2135c.a(TU.f3181a);
        if (a2 == null || a2.a()) {
            this.f.a(4013, System.currentTimeMillis() - currentTimeMillis);
        } else {
            this.d.a(a2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final void a(int i2, int i3, int i4) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final void a(MotionEvent motionEvent) {
        XT a2 = this.d.a();
        if (a2 != null) {
            try {
                a2.a((String) null, motionEvent);
            } catch (SU e2) {
                this.f.a(e2.a(), -1, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final void a(View view) {
        this.e.a(view);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.g.execute(new IU(this));
    }
}
