package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.c.b;
import b.c.b.a.e.a.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.gf  reason: case insensitive filesystem */
public final class C1340gf {

    /* renamed from: a  reason: collision with root package name */
    private static C1340gf f4404a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f4405b = new AtomicBoolean(false);

    C1340gf() {
    }

    public static C1340gf a() {
        if (f4404a == null) {
            f4404a = new C1340gf();
        }
        return f4404a;
    }

    private static void a(Context context, a aVar) {
        try {
            ((AbstractC2600yp) C0693Tl.a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", C1409hf.f4495a)).a(b.a(context), new BinderC1134df(aVar));
        } catch (RemoteException | C0771Wl | NullPointerException e) {
            C0745Vl.d("#007 Could not call remote method.", e);
        }
    }

    static /* synthetic */ void b(Context context) {
        C2474x.a(context);
        if (((Boolean) C2392voa.e().a(C2474x.fa)).booleanValue() && c(context)) {
            a(context, a.a(context));
        }
    }

    static /* synthetic */ void b(Context context, String str) {
        C2474x.a(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) C2392voa.e().a(C2474x.aa)).booleanValue());
        a(context, a.a(context, "FA-Ads", "am", str, bundle));
    }

    private static boolean c(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Thread a(Context context) {
        if (!this.f4405b.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Cif(this, context));
        thread.start();
        return thread;
    }

    public final Thread a(Context context, String str) {
        if (!this.f4405b.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new RunnableC1271ff(this, context, str));
        thread.start();
        return thread;
    }
}
