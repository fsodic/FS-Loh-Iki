package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.bz  reason: case insensitive filesystem */
public final class C1027bz implements AbstractC0520Mu, AbstractC0263Cx {

    /* renamed from: a  reason: collision with root package name */
    private final C2037qj f3956a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3957b;

    /* renamed from: c  reason: collision with root package name */
    private final C2243tj f3958c;
    private final View d;
    private String e;
    private final Oma.a f;

    public C1027bz(C2037qj qjVar, Context context, C2243tj tjVar, View view, Oma.a aVar) {
        this.f3956a = qjVar;
        this.f3957b = context;
        this.f3958c = tjVar;
        this.d = view;
        this.f = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0263Cx
    public final void O() {
        this.e = this.f3958c.b(this.f3957b);
        String valueOf = String.valueOf(this.e);
        String str = this.f == Oma.a.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.e = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void a(AbstractC1897oi oiVar, String str, String str2) {
        if (this.f3958c.a(this.f3957b)) {
            try {
                this.f3958c.a(this.f3957b, this.f3958c.e(this.f3957b), this.f3956a.a(), oiVar.getType(), oiVar.A());
            } catch (RemoteException e2) {
                C0745Vl.c("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void h() {
        View view = this.d;
        if (!(view == null || this.e == null)) {
            this.f3958c.c(view.getContext(), this.e);
        }
        this.f3956a.f(true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void j() {
        this.f3956a.f(false);
    }
}
