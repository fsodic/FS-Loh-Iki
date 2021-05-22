package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.b.j;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.soa  reason: case insensitive filesystem */
public abstract class AbstractC2185soa<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Voa f5554a = c();

    AbstractC2185soa() {
    }

    private static Voa c() {
        try {
            Object newInstance = C1565joa.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                C0745Vl.d("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            return queryLocalInterface instanceof Voa ? (Voa) queryLocalInterface : new Xoa(iBinder);
        } catch (Exception unused) {
            C0745Vl.d("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    private final T d() {
        Voa voa = f5554a;
        if (voa == null) {
            C0745Vl.d("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return a(voa);
        } catch (RemoteException e) {
            C0745Vl.c("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final T e() {
        try {
            return b();
        } catch (RemoteException e) {
            C0745Vl.c("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T a(Context context, boolean z) {
        T t;
        boolean z2 = false;
        boolean z3 = z;
        if (!z3) {
            C2392voa.a();
            if (!C0459Kl.c(context, j.f305a)) {
                C0745Vl.a("Google Play Services is not available.");
                z3 = true;
            }
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.b(context, ModuleDescriptor.MODULE_ID)) {
            z3 = true;
        }
        C2474x.a(context);
        if (C1743ma.f4957a.a().booleanValue()) {
            z3 = false;
        }
        if (z3) {
            t = d();
            if (t == null) {
                t = e();
            }
        } else {
            T e = e();
            int i = e == null ? 1 : 0;
            if (i != 0) {
                if (C2392voa.h().nextInt(C2363va.f5813a.a().intValue()) == 0) {
                    z2 = true;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    C2392voa.a().a(context, C2392voa.g().f3587a, "gmob-apps", bundle, true);
                }
            }
            t = e == null ? d() : e;
        }
        return t == null ? a() : t;
    }

    /* access modifiers changed from: protected */
    public abstract T a(Voa voa);

    /* access modifiers changed from: protected */
    public abstract T b();
}
