package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;

/* renamed from: com.google.android.gms.internal.ads.cR  reason: case insensitive filesystem */
public final class BinderC1046cR extends AbstractBinderC0612Qi {

    /* renamed from: a  reason: collision with root package name */
    private final VQ f3991a;

    /* renamed from: b  reason: collision with root package name */
    private final C2560yQ f3992b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3993c;
    private final AR d;
    private final Context e;
    private C2615zC f;

    public BinderC1046cR(String str, VQ vq, Context context, C2560yQ yQVar, AR ar) {
        this.f3993c = str;
        this.f3991a = vq;
        this.f3992b = yQVar;
        this.d = ar;
        this.e = context;
    }

    private final synchronized void a(Zna zna, AbstractC0716Ui ui, int i) {
        r.a("#008 Must be called on the main UI thread.");
        this.f3992b.a(ui);
        q.c();
        if (C2452wk.p(this.e) && zna.s == null) {
            C0745Vl.b("Failed to load the ad because app ID is missing.");
            this.f3992b.c(8);
        } else if (this.f == null) {
            SQ sq = new SQ(null);
            this.f3991a.a(i);
            this.f3991a.a(zna, this.f3993c, sq, new C1252fR(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final AbstractC2187spa C() {
        C2615zC zCVar;
        if (((Boolean) C2392voa.e().a(C2474x.Ge)).booleanValue() && (zCVar = this.f) != null) {
            return zCVar.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final Bundle I() {
        r.a("#008 Must be called on the main UI thread.");
        C2615zC zCVar = this.f;
        return zCVar != null ? zCVar.g() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final AbstractC0508Mi La() {
        r.a("#008 Must be called on the main UI thread.");
        C2615zC zCVar = this.f;
        if (zCVar != null) {
            return zCVar.j();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final synchronized void a(a aVar, boolean z) {
        r.a("#008 Must be called on the main UI thread.");
        if (this.f == null) {
            C0745Vl.d("Rewarded can not be shown before loaded");
            this.f3992b.a(new Sna(2, "The ad is not ready.", "com.google.android.gms.ads"));
            return;
        }
        this.f.a(z, (Activity) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final void a(AbstractC0664Si si) {
        r.a("#008 Must be called on the main UI thread.");
        this.f3992b.a(si);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final void a(AbstractC0742Vi vi) {
        r.a("#008 Must be called on the main UI thread.");
        this.f3992b.a(vi);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final synchronized void a(C0846Zi zi) {
        r.a("#008 Must be called on the main UI thread.");
        AR ar = this.d;
        ar.f1511a = zi.f3661a;
        if (((Boolean) C2392voa.e().a(C2474x.va)).booleanValue()) {
            ar.f1512b = zi.f3662b;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final synchronized void a(Zna zna, AbstractC0716Ui ui) {
        a(zna, ui, C2492xR.f5982b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final void a(AbstractC1705lpa lpa) {
        if (lpa == null) {
            this.f3992b.a((com.google.android.gms.ads.g.a) null);
        } else {
            this.f3992b.a(new C0977bR(this, lpa));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final void a(AbstractC2118rpa rpa) {
        r.a("setOnPaidEventListener must be called on the main UI thread.");
        this.f3992b.a(rpa);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final boolean aa() {
        r.a("#008 Must be called on the main UI thread.");
        C2615zC zCVar = this.f;
        return zCVar != null && !zCVar.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final synchronized void b(Zna zna, AbstractC0716Ui ui) {
        a(zna, ui, C2492xR.f5983c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final synchronized String k() {
        if (this.f == null || this.f.d() == null) {
            return null;
        }
        return this.f.d().k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0638Ri
    public final synchronized void l(a aVar) {
        a(aVar, false);
    }
}
