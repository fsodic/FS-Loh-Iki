package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.b.a.c.a;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.h;
import com.google.android.gms.ads.s;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.pb  reason: case insensitive filesystem */
public final class C1952pb extends h {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1883ob f5241a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f5242b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C0838Za f5243c;
    private final s d = new s();
    private final c.a e;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ RemoteException -> 0x0085 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1952pb(com.google.android.gms.internal.ads.AbstractC1883ob r6) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1952pb.<init>(com.google.android.gms.internal.ads.ob):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final a a() {
        try {
            return this.f5241a.z();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.h
    public final CharSequence b() {
        try {
            return this.f5241a.D();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.h
    public final CharSequence c() {
        try {
            return this.f5241a.s();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.h
    public final CharSequence d() {
        try {
            return this.f5241a.o();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.h
    public final CharSequence e() {
        try {
            return this.f5241a.l();
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.b.h
    public final List<c.b> f() {
        return this.f5242b;
    }

    @Override // com.google.android.gms.ads.b.h
    public final c.b g() {
        return this.f5243c;
    }

    @Override // com.google.android.gms.ads.b.h
    public final s h() {
        try {
            if (this.f5241a.getVideoController() != null) {
                this.d.a(this.f5241a.getVideoController());
            }
        } catch (RemoteException e2) {
            C0745Vl.b("Exception occurred while getting video controller", e2);
        }
        return this.d;
    }
}
