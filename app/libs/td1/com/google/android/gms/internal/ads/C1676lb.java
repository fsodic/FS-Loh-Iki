package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.b.a.c.a;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.g;
import com.google.android.gms.ads.s;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.lb  reason: case insensitive filesystem */
public final class C1676lb extends g {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1607kb f4863a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f4864b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C0838Za f4865c;
    private final s d = new s();
    private final c.a e;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ RemoteException -> 0x0085 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1676lb(com.google.android.gms.internal.ads.AbstractC1607kb r6) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1676lb.<init>(com.google.android.gms.internal.ads.kb):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final a a() {
        try {
            return this.f4863a.z();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.g
    public final CharSequence b() {
        try {
            return this.f4863a.s();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.g
    public final CharSequence c() {
        try {
            return this.f4863a.o();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.g
    public final CharSequence d() {
        try {
            return this.f4863a.l();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.g
    public final c.b e() {
        return this.f4865c;
    }

    @Override // com.google.android.gms.ads.b.g
    public final List<c.b> f() {
        return this.f4864b;
    }

    @Override // com.google.android.gms.ads.b.g
    public final CharSequence g() {
        try {
            return this.f4863a.y();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.g
    public final Double h() {
        try {
            double B = this.f4863a.B();
            if (B == -1.0d) {
                return null;
            }
            return Double.valueOf(B);
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.g
    public final CharSequence i() {
        try {
            return this.f4863a.E();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.g
    public final s j() {
        try {
            if (this.f4863a.getVideoController() != null) {
                this.d.a(this.f4863a.getVideoController());
            }
        } catch (RemoteException e2) {
            C0745Vl.b("Exception occurred while getting video controller", e2);
        }
        return this.d;
    }
}
