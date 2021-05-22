package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.k;
import com.google.android.gms.ads.n;
import com.google.android.gms.ads.s;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Xb  reason: case insensitive filesystem */
public final class C0787Xb extends k {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0761Wb f3509a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f3510b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C0838Za f3511c;
    private final s d = new s();
    private final c.a e;
    private final List<n> f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[Catch:{ RemoteException -> 0x00bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0787Xb(com.google.android.gms.internal.ads.AbstractC0761Wb r6) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0787Xb.<init>(com.google.android.gms.internal.ads.Wb):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final a k() {
        try {
            return this.f3509a.z();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.k
    public final String a() {
        try {
            return this.f3509a.D();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.k
    public final String b() {
        try {
            return this.f3509a.s();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.k
    public final String c() {
        try {
            return this.f3509a.o();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.k
    public final String d() {
        try {
            return this.f3509a.l();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.k
    public final c.b e() {
        return this.f3511c;
    }

    @Override // com.google.android.gms.ads.b.k
    public final List<c.b> f() {
        return this.f3510b;
    }

    @Override // com.google.android.gms.ads.b.k
    public final String g() {
        try {
            return this.f3509a.y();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.k
    public final Double h() {
        try {
            double B = this.f3509a.B();
            if (B == -1.0d) {
                return null;
            }
            return Double.valueOf(B);
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.k
    public final String i() {
        try {
            return this.f3509a.E();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.k
    public final s j() {
        try {
            if (this.f3509a.getVideoController() != null) {
                this.d.a(this.f3509a.getVideoController());
            }
        } catch (RemoteException e2) {
            C0745Vl.b("Exception occurred while getting video controller", e2);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.b.k
    public final Object l() {
        try {
            a m = this.f3509a.m();
            if (m != null) {
                return b.Q(m);
            }
            return null;
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }
}
