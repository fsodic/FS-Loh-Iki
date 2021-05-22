package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1740mX;
import com.google.android.gms.internal.ads.C0459Kl;
import com.google.android.gms.internal.ads.C0745Vl;
import com.google.android.gms.internal.ads.C0823Yl;
import com.google.android.gms.internal.ads.C0875_l;
import com.google.android.gms.internal.ads.C2392voa;
import com.google.android.gms.internal.ads.C2474x;
import com.google.android.gms.internal.ads.HT;
import com.google.android.gms.internal.ads.Raa;
import com.google.android.gms.internal.ads.XJ;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.cocos2dx.lib.BuildConfig;

public final class h implements AbstractC1740mX, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final List<Object[]> f1084a = new Vector();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<AbstractC1740mX> f1085b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<AbstractC1740mX> f1086c = new AtomicReference<>();
    private final int d;
    private Context e;
    private C0823Yl f;
    private CountDownLatch g = new CountDownLatch(1);

    public h(Context context, C0823Yl yl) {
        this.e = context;
        this.f = yl;
        int intValue = ((Integer) C2392voa.e().a(C2474x.tb)).intValue();
        this.d = intValue != 1 ? intValue != 2 ? XJ.f3487a : XJ.f3489c : XJ.f3488b;
        if (!((Boolean) C2392voa.e().a(C2474x.Kb)).booleanValue()) {
            C2392voa.a();
            if (!C0459Kl.b()) {
                run();
                return;
            }
        }
        C0875_l.f3755a.execute(this);
    }

    private final AbstractC1740mX a() {
        return (this.d == XJ.f3488b ? this.f1086c : this.f1085b).get();
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final boolean b() {
        try {
            this.g.await();
            return true;
        } catch (InterruptedException e2) {
            C0745Vl.c("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    private final void c() {
        AbstractC1740mX a2 = a();
        if (!(this.f1084a.isEmpty() || a2 == null)) {
            for (Object[] objArr : this.f1084a) {
                if (objArr.length == 1) {
                    a2.a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    a2.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f1084a.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context) {
        if (!b()) {
            return BuildConfig.FLAVOR;
        }
        int i = this.d;
        AbstractC1740mX mXVar = ((i == XJ.f3488b || i == XJ.f3489c) ? this.f1086c : this.f1085b).get();
        if (mXVar == null) {
            return BuildConfig.FLAVOR;
        }
        c();
        return mXVar.a(b(context));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context, View view, Activity activity) {
        AbstractC1740mX a2 = a();
        return a2 != null ? a2.a(context, view, activity) : BuildConfig.FLAVOR;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final String a(Context context, String str, View view, Activity activity) {
        AbstractC1740mX a2;
        if (!b() || (a2 = a()) == null) {
            return BuildConfig.FLAVOR;
        }
        c();
        return a2.a(b(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final void a(int i, int i2, int i3) {
        AbstractC1740mX a2 = a();
        if (a2 != null) {
            c();
            a2.a(i, i2, i3);
            return;
        }
        this.f1084a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final void a(MotionEvent motionEvent) {
        AbstractC1740mX a2 = a();
        if (a2 != null) {
            c();
            a2.a(motionEvent);
            return;
        }
        this.f1084a.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1740mX
    public final void a(View view) {
        AbstractC1740mX a2 = a();
        if (a2 != null) {
            a2.a(view);
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f.d;
            if (!((Boolean) C2392voa.e().a(C2474x.Aa)).booleanValue() && z2) {
                z = true;
            }
            if (this.d != XJ.f3488b) {
                this.f1085b.set(Raa.b(this.f.f3587a, b(this.e), z, this.d));
            }
            if (this.d != XJ.f3487a) {
                this.f1086c.set(HT.a(this.f.f3587a, b(this.e), z));
            }
        } finally {
            this.g.countDown();
            this.e = null;
            this.f = null;
        }
    }
}
