package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.overlay.t;

/* renamed from: com.google.android.gms.internal.ads.lC */
public final class C1650lC implements o, t, AbstractC1472ic, AbstractC1609kc, Ona {

    /* renamed from: a */
    private Ona f4827a;

    /* renamed from: b */
    private AbstractC1472ic f4828b;

    /* renamed from: c */
    private o f4829c;
    private AbstractC1609kc d;
    private t e;

    private C1650lC() {
    }

    /* synthetic */ C1650lC(C1375hC hCVar) {
        this();
    }

    /* access modifiers changed from: public */
    private final synchronized void a(Ona ona, AbstractC1472ic icVar, o oVar, AbstractC1609kc kcVar, t tVar) {
        this.f4827a = ona;
        this.f4828b = icVar;
        this.f4829c = oVar;
        this.d = kcVar;
        this.e = tVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void I() {
        if (this.f4829c != null) {
            this.f4829c.I();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void J() {
        if (this.f4829c != null) {
            this.f4829c.J();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.t
    public final synchronized void a() {
        if (this.e != null) {
            this.e.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1472ic
    public final synchronized void a(String str, Bundle bundle) {
        if (this.f4828b != null) {
            this.f4828b.a(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1609kc
    public final synchronized void a(String str, String str2) {
        if (this.d != null) {
            this.d.a(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ona
    public final synchronized void e() {
        if (this.f4827a != null) {
            this.f4827a.e();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void onPause() {
        if (this.f4829c != null) {
            this.f4829c.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void onResume() {
        if (this.f4829c != null) {
            this.f4829c.onResume();
        }
    }
}
